package com.code.api.sharktank.services;

import java.util.List;

import com.code.api.sharktank.models.Comment;

public interface ICommentService {
    Comment addComment(Comment comment);
    List<Comment> getCommentsByPitchId(Long pitchId);
    void deleteComment(Long id);
}
