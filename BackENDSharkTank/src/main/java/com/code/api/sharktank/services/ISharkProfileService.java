package com.code.api.sharktank.services;

import java.util.List;
import java.util.Optional;

import com.code.api.sharktank.models.SharkProfile;

public interface ISharkProfileService {
    SharkProfile registerShark(SharkProfile profile);
    Optional<SharkProfile> getById(Long id);
    List<SharkProfile> getAllSharks();
    void deleteShark(Long id);
}
