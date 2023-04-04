package com.irvanudin.uts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irvanudin.uts.models.TafsirModel;
import com.irvanudin.uts.services.QuranService;

@Controller
public class TafsirController {

    private final QuranService quranService;

    public TafsirController(QuranService quranService) {
        this.quranService = quranService;
    }

    @GetMapping("/tafsir/{id}")
    public String main(@PathVariable Long id, Model model) throws JsonProcessingException {
        // JsonString
        String tafsirJString = quranService.getTafsir(id);
        // Json to Object
        ObjectMapper objectMapper = new ObjectMapper();
        TafsirModel tafsirObj = objectMapper.readValue(tafsirJString, TafsirModel.class); 
        // Add to Model
        model.addAttribute("obj", tafsirObj);
        // Return View
        return "tafsir";
    }
    
}