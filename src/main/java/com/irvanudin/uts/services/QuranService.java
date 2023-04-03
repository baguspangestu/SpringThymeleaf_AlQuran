package com.irvanudin.uts.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuranService {

    private final RestTemplate restTemplate;

    public QuranService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private String root = "https://equran.id/api/v2";

    public String getSurat() {
      String url = root + "/surat";
      ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
      return response.getBody();
    }
    
    public String getDetailSurat(Number nomor) {
      String url =  root + "/surat/" + nomor;
      ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
      return response.getBody();
    }

    public String getDetailTafsir(Number nomor) {
      String url =  root + "/tafsir/" + nomor;
      ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
      return response.getBody();
    }
}
