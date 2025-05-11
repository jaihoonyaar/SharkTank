package com.code.api.sharktank.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.api.sharktank.models.FounderProfile;
import com.code.api.sharktank.reposatories.FounderProfileRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FounderProfileServiceImpl implements IFounderProfileService {

    @Autowired
    private FounderProfileRepository repository;

    @Override
    public FounderProfile registerFounder(FounderProfile founder) {
        return repository.save(founder);
    }

    @Override
    public Optional<FounderProfile> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<FounderProfile> getAllFounders() {
        return repository.findAll();
    }

    @Override
    public void deleteFounder(Long id) {
        repository.deleteById(id);
    }
}
