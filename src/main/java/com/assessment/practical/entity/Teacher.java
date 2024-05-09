package com.assessment.practical.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection= "teacher")
public class Teacher {
    @Id
    private String id;
    private String fname;
    private String lname;
}
