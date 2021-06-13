package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.CEP;

@RestController
public class CepController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/cep/{cep}")
    public CEP search(@PathVariable("cep") String cep) {
        String viaCepURL = "http://viacep.com.br/ws/ " + cep + "/json/";

        ResponseEntity<CEP> response = restTemplate.getForEntity(viaCepURL, CEP.class);
        return response.getBody();
    }
}
