package com.example.miniprojet.service;

import com.example.miniprojet.repository.SpecialiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialiteService {
    @Autowired
    SpecialiteRepository specialiteRepository;
}
