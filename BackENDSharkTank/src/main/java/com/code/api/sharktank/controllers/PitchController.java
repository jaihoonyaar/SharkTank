package com.code.api.sharktank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.code.api.sharktank.models.Pitch;
import com.code.api.sharktank.services.IPitchService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pitches")
@CrossOrigin(origins = "*")
public class PitchController {

    @Autowired
    private IPitchService pitchService;

    @PostMapping("/upload")
    public Pitch uploadPitch(@RequestBody Pitch pitch) {
        return pitchService.uploadPitch(pitch);
    }

    @GetMapping
    public List<Pitch> getAllPitches() {
        return pitchService.getAllPitches();
    }

    @GetMapping("/{id}")
    public Optional<Pitch> getPitchById(@PathVariable Long id) {
        return pitchService.getPitchById(id);
    }

    @GetMapping("/founder/{founderId}")
    public List<Pitch> getPitchesByFounder(@PathVariable Long founderId) {
        return pitchService.getPitchesByFounderId(founderId);
    }

    @DeleteMapping("/{id}")
    public void deletePitch(@PathVariable Long id) {
        pitchService.deletePitch(id);
    }
}
