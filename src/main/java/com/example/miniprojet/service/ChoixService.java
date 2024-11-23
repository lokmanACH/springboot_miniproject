package com.example.miniprojet.service;

import com.example.miniprojet.repository.ChoixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoixService {
    @Autowired
    ChoixRepository choixRepository;
}
