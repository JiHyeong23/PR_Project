package com.example.PR.aboutMe;

import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-07T12:57:44+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.17 (Azul Systems, Inc.)"
)
@Component
public class MyMapperImpl implements MyMapper {

    @Override
    public IntroduceDto MeToIntroduceDto(Me me) {
        if ( me == null ) {
            return null;
        }

        String name = null;
        Date dOB = null;
        String lOE = null;
        int phone = 0;
        String email = null;
        String stack = null;
        String imagePath = null;

        name = me.getName();
        dOB = me.getDOB();
        lOE = me.getLOE();
        phone = me.getPhone();
        email = me.getEmail();
        stack = me.getStack();
        imagePath = me.getImagePath();

        String license = null;
        String experience = null;

        IntroduceDto introduceDto = new IntroduceDto( name, dOB, lOE, phone, email, license, stack, experience, imagePath );

        return introduceDto;
    }
}
