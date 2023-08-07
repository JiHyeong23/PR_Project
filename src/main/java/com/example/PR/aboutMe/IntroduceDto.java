package com.example.PR.aboutMe;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class IntroduceDto {
    private String name;
    private Date DOB; //date of birth
    private String LOE; //level of education
    private int phone;
    private String email;
    private String license;
    private String stack;
    private String Experience;
    private String imagePath;
}
