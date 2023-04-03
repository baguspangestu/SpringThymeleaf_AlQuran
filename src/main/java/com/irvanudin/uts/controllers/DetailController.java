package com.irvanudin.uts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irvanudin.uts.models.DetailSuratModel;
import com.irvanudin.uts.services.QuranService;

@Controller
public class DetailController {

    private final QuranService quranService;

    public DetailController(QuranService quranService) {
        this.quranService = quranService;
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Long id, Model model) throws JsonProcessingException {
        // JsonString
        String detailJString = quranService.getDetailSurat(id);
        // Json to Object
        ObjectMapper objectMapper = new ObjectMapper();
        DetailSuratModel detailObj = objectMapper.readValue(detailJString, DetailSuratModel.class); 
        // Add to Model
        model.addAttribute("detail", detailObj);
        // Return View
        return "detail";
    }
    
}