package com.code.api.sharktank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.api.sharktank.models.PitchStats;
import com.code.api.sharktank.reposatories.PitchStatsRepository;

import java.util.Optional;

@Service
public class PitchStatsServiceImpl implements IPitchStatsService {

    @Autowired
    private PitchStatsRepository repository;

    @Override
    public PitchStats createStats(PitchStats stats) {
        return repository.save(stats);
    }

    @Override
    public Optional<PitchStats> getStatsById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<PitchStats> getStatsByPitchId(Long pitchId) {
        return repository.findAll().stream()
            .filter(stat -> stat.getPitch().getId().equals(pitchId))
            .findFirst();
    }

    @Override
    public PitchStats updateStats(PitchStats stats) {
        return repository.save(stats);
    }

    @Override
    public void deleteStats(Long id) {
        repository.deleteById(id);
    }
}
