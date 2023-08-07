package com.example.PR.comment;

import com.example.PR.comment.Dto.CommentDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-07T12:57:44+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Azul Systems, Inc.)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public Comment commemtDtoToComment(CommentDto commentDto) {
        if ( commentDto == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setName( commentDto.getName() );
        comment.setPassword( commentDto.getPassword() );
        comment.setComment( commentDto.getComment() );

        return comment;
    }
}
