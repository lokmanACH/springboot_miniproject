package com.example.miniprojet.controller;


import com.example.miniprojet.model.Etudiant;
import com.example.miniprojet.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;

    @PostMapping("/add")
    public String add(@RequestBody Etudiant student) {
        etudiantService.addEtudiant(student);
        return "New student is added";
    }
    @PutMapping("/{id}/update")
    public String update(@PathVariable Long id, @RequestBody Etudiant etudiant) {
        try {
            Etudiant updatedEtudiant = etudiantService.updateEtudiant(id, etudiant);
            return "Student with ID " + id + " has been successfully updated.";
        } catch (RuntimeException e) {
            return "Error: Student with ID " + id + " not found.";
        } catch (Exception e) {
            return "An unexpected error occurred: " + e.getMessage();
        }
    }
    @DeleteMapping("/{id}/delete")
    public String delete(@PathVariable Long id){
        etudiantService.deleteEtudiant(id);
        return "Student with ID " + id + " has been successfully deleted.";
    }

}
