package com.example.formationopenshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EssaiController {

    @GetMapping(value= "/essai")
    public String getEssai() {
        return "Ca marche";
    }
}
