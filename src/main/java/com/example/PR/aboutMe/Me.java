package com.example.PR.aboutMe;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Me {
    @Id
    private Long id;
    private String name;
    private Date DOB; //date of birth
    private String LOE; //level of education
    private int phone;
    private String email;
    private String stack;
    private String Experience;
    private String imagePath;
//    @OneToMany(mappedBy = "me")
//    private List<License> licenses = new ArrayList<>();
}
