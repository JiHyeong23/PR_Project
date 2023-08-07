package com.example.PR.lisence;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class License {
    @Id
    private Long id;
    private String name;
    private Date DOA;//date of acquisition
    private String imagePath;


}
