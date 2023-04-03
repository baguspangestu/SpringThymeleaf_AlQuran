package com.irvanudin.uts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.irvanudin.uts.models.SuratModel;
import com.irvanudin.uts.services.QuranService;

@Controller
public class HomeController {

    private final QuranService quranService;

    public HomeController(QuranService quranService) {
        this.quranService = quranService;
    }

    @GetMapping("/")
    public String home(Model model) throws JsonProcessingException {
        // JsonString
        String suratJString = quranService.getSurat();
        // Json to Object
        ObjectMapper objectMapper = new ObjectMapper();
        SuratModel suratObj = objectMapper.readValue(suratJString, SuratModel.class); 
        // Add to Model
        model.addAttribute("surat", suratObj);
        // Return View
        return "home";
    }
    
}
