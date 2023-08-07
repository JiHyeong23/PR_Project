package com.example.PR.experience;

import com.example.PR.experience.Dto.ExperienceDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-07T12:57:44+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Azul Systems, Inc.)"
)
@Component
public class ExperienceMapperImpl implements ExperienceMapper {

    @Override
    public Experience experienceDtoToExperience(ExperienceDto experienceDto) {
        if ( experienceDto == null ) {
            return null;
        }

        Experience experience = new Experience();

        experience.setName( experienceDto.getName() );
        experience.setStartDate( experienceDto.getStartDate() );
        experience.setEndDate( experienceDto.getEndDate() );
        experience.setPosition( experienceDto.getPosition() );
        experience.setUrl( experienceDto.getUrl() );
        experience.setImagePath( experienceDto.getImagePath() );
        experience.setNote( experienceDto.getNote() );

        return experience;
    }
}
