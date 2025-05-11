package com.code.api.sharktank.controllers; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.code.api.sharktank.models.Comment;
import com.code.api.sharktank.services.ICommentService;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
@CrossOrigin(origins = "*")
public class CommentController {

    @Autowired
    private ICommentService commentService;

    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @GetMapping("/pitch/{pitchId}")
    public List<Comment> getCommentsByPitch(@PathVariable Long pitchId) {
        return commentService.getCommentsByPitchId(pitchId);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }
}
