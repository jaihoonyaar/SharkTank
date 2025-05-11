package com.code.api.sharktank.reposatories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.api.sharktank.models.PitchStats;
@Repository
public interface PitchStatsRepository extends JpaRepository<PitchStats, Long> {
}
