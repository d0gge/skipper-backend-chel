package com.tinkoff.skipper.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserMenteeStatsDTO {

    private Integer allLessons;
    private Integer cancelledLessons;

    private Integer allLessonsPastMonth;
    private Integer cancelledLessonsPastMonth;

    private Integer allLessonsPast3Month;
    private Integer cancelledLessonsPast3Month;

}
