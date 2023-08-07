package com.example.PR.experience;

import com.example.PR.experience.Dto.ExperienceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ExperienceMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "startDate", target = "startDate")
    @Mapping(source = "endDate", target = "endDate")
    @Mapping(source = "position", target = "position")
    @Mapping(source = "url", target = "url")
    @Mapping(source = "imagePath", target = "imagePath")
    @Mapping(source = "note", target = "note")
    Experience experienceDtoToExperience(ExperienceDto experienceDto);

}
