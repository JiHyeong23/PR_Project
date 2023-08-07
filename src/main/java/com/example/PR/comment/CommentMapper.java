package com.example.PR.comment;

import com.example.PR.comment.Dto.CommentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentMapper {
    @Mapping(source = "name", target = "name")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "comment", target = "comment")
    Comment commemtDtoToComment(CommentDto commentDto);
}
