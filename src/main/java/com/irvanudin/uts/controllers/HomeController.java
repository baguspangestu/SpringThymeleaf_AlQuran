package com.irvanudin.uts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irvanudin.uts.models.AllSuratModel;
import com.irvanudin.uts.services.QuranService;

@Controller
public class HomeController {

    private final QuranService quranService;

    public HomeController(QuranService quranService) {
        this.quranService = quranService;
    }

    @GetMapping("/")
    public String main(Model model) throws JsonProcessingException {
        // JsonString
        String allSuratJString = quranService.getAllSurat();
        // Json to Object
        ObjectMapper objectMapper = new ObjectMapper();
        AllSuratModel allSuratObj = objectMapper.readValue(allSuratJString, AllSuratModel.class); 
        // Add to Model
        model.addAttribute("obj", allSuratObj);
        // Return View
        return "home";
    }
    
}
