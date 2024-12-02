package com.example.miniprojet.controller;

import com.example.miniprojet.model.Choix;
import com.example.miniprojet.service.ChoixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/choice")
public class ChoixController {
    @Autowired
    ChoixService choixService;

    @PostMapping("/addAll")
    public String addChoices(@RequestBody List<Choix> choices){
        for (Choix choice : choices){
            choixService.addChoix(choice);
        }
        return "New Choices are added";
    }
}
