package com.code.api.sharktank.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.code.api.sharktank.models.FounderProfile;
import com.code.api.sharktank.services.IFounderProfileService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/founders")
@CrossOrigin(origins = "*")
public class FounderProfileController {

    @Autowired
    private IFounderProfileService founderService;

    @PostMapping("/register")
    public FounderProfile registerFounder(@RequestBody FounderProfile founder) {
        return founderService.registerFounder(founder);
    }

    @GetMapping("/{id}")
    public Optional<FounderProfile> getFounderById(@PathVariable Long id) {
        return founderService.getById(id);
    }

    @GetMapping
    public List<FounderProfile> getAllFounders() {
        return founderService.getAllFounders();
    }

    @DeleteMapping("/{id}")
    public void deleteFounder(@PathVariable Long id) {
        founderService.deleteFounder(id);
    }
}
