package com.code.api.sharktank.reposatories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.api.sharktank.models.Pitch;

import java.util.List;
@Repository
public interface PitchRepository extends JpaRepository<Pitch, Long> {
    List<Pitch> findByFounderId(Long founderId);
}
