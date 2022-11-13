package com.tinkoff.skipper.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@Table (name = "mentor_info")
public class MentorInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private String subject;
    private BigDecimal price;
    private String description;
    private String education;
    private String workExperience;
    private Integer rating;
    @Column(name = "number_of_students")
    private Integer studentNumber;


    //заменить каскад
    @OneToMany(mappedBy = "mentorId")//, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<LessonEntity> lessons;

}
