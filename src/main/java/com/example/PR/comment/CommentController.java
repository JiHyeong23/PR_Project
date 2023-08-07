package com.example.PR.comment;

import com.example.PR.comment.Dto.CommentDto;
import com.example.PR.comment.Dto.DeleteCommentDto;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/comment")
@AllArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/add")
    public String addForm(Model model) {
        System.out.println(" new comment made ");
        Comment comment = new Comment();
        model.addAttribute("comment", comment); //빈 오브젝트를 뷰에 넘겨준다.
        return "addComment";
    }

    @PostMapping("/add")
    public String addComment(@ModelAttribute Comment comment) {
        System.out.println("data in");
        System.out.println(comment.toString());
        commentService.postComment(comment);
        return "redirect:/comment";
    }

    @DeleteMapping
    public ResponseEntity deleteComment(@RequestBody DeleteCommentDto deleteCommentDto) {
        Boolean success = commentService.deleteComment(deleteCommentDto);
        if(success) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public String getComments() {
        return "comment";
    }
//    @GetMapping
//    public ResponseEntity getComments(@RequestParam int page) {
//        Page<Comment> commentsPage = commentService.getComments(page);
//        return ResponseEntity.ok().body(commentsPage);
//    }

//    @PostMapping
//    public ResponseEntity postComment(@RequestBody CommentDto commentDto) {
//        System.out.println("in + " + commentDto.toString());
//        commentService.postComment(commentDto);
//        return new ResponseEntity(HttpStatus.OK);
//    }
}
