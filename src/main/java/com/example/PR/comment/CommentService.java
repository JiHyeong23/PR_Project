package com.example.PR.comment;

import com.example.PR.comment.Dto.CommentDto;
import com.example.PR.comment.Dto.DeleteCommentDto;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CommentService {

    private final CommentMapper commentMapper;
    private final CommentRepository commentRepository;



    public void postComment(Comment comment) {
        //Comment comment = commentMapper.commemtDtoToComment(commentDto);
        commentRepository.save(comment);
    }

    public Boolean deleteComment(DeleteCommentDto deleteCommentDto) {
        Optional<Comment> findComment =
                Optional.ofNullable(commentRepository.findByNameAndPassword(deleteCommentDto.getName(), deleteCommentDto.getPassword()));

        if(findComment.isEmpty()) {
            return Boolean.FALSE;
        } else {
            Comment comment = findComment.get();
            commentRepository.delete(comment);
            return Boolean.TRUE;
        }
    }

    public Page<Comment> getComments(@RequestParam int page) {
        Pageable pageable = PageRequest.of(page-1, 10);
        return commentRepository.findAll(pageable);
    }
}
