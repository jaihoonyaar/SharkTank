package com.code.api.sharktank.services;

import java.util.List;
import java.util.Optional;

import com.code.api.sharktank.models.FounderProfile;

public interface IFounderProfileService {
    FounderProfile registerFounder(FounderProfile founder);
    Optional<FounderProfile> getById(Long id);
    List<FounderProfile> getAllFounders();
    void deleteFounder(Long id);
}
