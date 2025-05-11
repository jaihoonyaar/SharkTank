package com.code.api.sharktank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.api.sharktank.models.Comment;
import com.code.api.sharktank.reposatories.CommentRepository;

import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {

    @Autowired
    private CommentRepository repository;

    @Override
    public Comment addComment(Comment comment) {
        return repository.save(comment);
    }

    @Override
    public List<Comment> getCommentsByPitchId(Long pitchId) {
        return repository.findByPitchId(pitchId);
    }

    @Override
    public void deleteComment(Long id) {
        repository.deleteById(id);
    }
}
