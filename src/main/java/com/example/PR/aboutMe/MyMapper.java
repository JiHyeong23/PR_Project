package com.example.PR.aboutMe;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MyMapper {
    IntroduceDto MeToIntroduceDto(Me me);
}
