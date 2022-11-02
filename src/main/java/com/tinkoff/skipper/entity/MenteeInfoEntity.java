package com.tinkoff.skipper.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MenteeInfoEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(name = "attendance")
    private Integer attendance;

    @Column(name = "number_of_lessons")
    private Integer lessonsNumber;

    @Column(name = "number_of_cancelled_lessons")
    private Integer cancelledLessonsNumber;
}
