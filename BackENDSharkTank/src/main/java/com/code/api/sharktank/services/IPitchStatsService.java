package com.code.api.sharktank.services;

import java.util.Optional;

import com.code.api.sharktank.models.PitchStats;

public interface IPitchStatsService {
    PitchStats createStats(PitchStats stats);
    Optional<PitchStats> getStatsById(Long id);
    Optional<PitchStats> getStatsByPitchId(Long pitchId);
    PitchStats updateStats(PitchStats stats);
    void deleteStats(Long id);
}
