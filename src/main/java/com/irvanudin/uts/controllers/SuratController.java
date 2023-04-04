package com.irvanudin.uts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irvanudin.uts.models.SuratModel;
import com.irvanudin.uts.services.QuranService;

@Controller
public class SuratController {

    private final QuranService quranService;

    public SuratController(QuranService quranService) {
        this.quranService = quranService;
    }

    @GetMapping("/surat/{id}")
    public String main(@PathVariable Long id, Model model) throws JsonProcessingException {
        // JsonString
        String suratJString = quranService.getSurat(id);
        // Json to Object
        ObjectMapper objectMapper = new ObjectMapper();
        SuratModel suratObj = objectMapper.readValue(suratJString, SuratModel.class); 
        // Add to Model
        model.addAttribute("obj", suratObj);
        // Return View
        return "surat";
    }
    
}