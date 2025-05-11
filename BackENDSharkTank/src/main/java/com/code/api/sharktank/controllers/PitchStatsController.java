package com.code.api.sharktank.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.code.api.sharktank.models.PitchStats;
import com.code.api.sharktank.services.IPitchStatsService;

import java.util.Optional;

@RestController
@RequestMapping("/api/stats")
@CrossOrigin(origins = "*")
public class PitchStatsController {

    @Autowired
    private IPitchStatsService statsService;

    @PostMapping
    public PitchStats createStats(@RequestBody PitchStats stats) {
        return statsService.createStats(stats);
    }

    @GetMapping("/{id}")
    public Optional<PitchStats> getStatsById(@PathVariable Long id) {
        return statsService.getStatsById(id);
    }

    @GetMapping("/pitch/{pitchId}")
    public Optional<PitchStats> getStatsByPitch(@PathVariable Long pitchId) {
        return statsService.getStatsByPitchId(pitchId);
    }

    @PutMapping
    public PitchStats updateStats(@RequestBody PitchStats stats) {
        return statsService.updateStats(stats);
    }

    @DeleteMapping("/{id}")
    public void deleteStats(@PathVariable Long id) {
        statsService.deleteStats(id);
    }
}
