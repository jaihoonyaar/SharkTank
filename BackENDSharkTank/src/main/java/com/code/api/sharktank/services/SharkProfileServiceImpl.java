package com.code.api.sharktank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.api.sharktank.models.SharkProfile;
import com.code.api.sharktank.reposatories.SharkProfileRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SharkProfileServiceImpl implements ISharkProfileService {

    @Autowired
    private SharkProfileRepository repository;

    @Override
    public SharkProfile registerShark(SharkProfile profile) {
        return repository.save(profile);
    }

    @Override
    public Optional<SharkProfile> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<SharkProfile> getAllSharks() {
        return repository.findAll();
    }

    @Override
    public void deleteShark(Long id) {
        repository.deleteById(id);
    }
}
