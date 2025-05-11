package com.code.api.sharktank.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.api.sharktank.models.Pitch;
import com.code.api.sharktank.reposatories.PitchRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PitchServiceImpl implements IPitchService {

    @Autowired
    private PitchRepository repository;

    @Override
    public Pitch uploadPitch(Pitch pitch) {
        return repository.save(pitch);
    }

    @Override
    public List<Pitch> getAllPitches() {
        return repository.findAll();
    }

    @Override
    public Optional<Pitch> getPitchById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Pitch> getPitchesByFounderId(Long founderId) {
        return repository.findByFounderId(founderId);
    }

    @Override
    public void deletePitch(Long id) {
        repository.deleteById(id);
    }
}
