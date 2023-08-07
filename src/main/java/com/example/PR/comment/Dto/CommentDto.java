package com.example.PR.comment.Dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class CommentDto {
    private String name;
    private String password;
    @NotNull
    private String comment;
}
