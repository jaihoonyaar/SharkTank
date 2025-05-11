package com.code.api.sharktank.services;


import java.util.List;
import java.util.Optional;

import com.code.api.sharktank.models.Pitch;

public interface IPitchService {
    Pitch uploadPitch(Pitch pitch);
    List<Pitch> getAllPitches();
    Optional<Pitch> getPitchById(Long id);
    List<Pitch> getPitchesByFounderId(Long founderId);
    void deletePitch(Long id);
}
