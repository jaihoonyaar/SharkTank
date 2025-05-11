package com.code.api.sharktank.reposatories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.api.sharktank.models.Comment;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPitchId(Long pitchId);
}
