package edu.ds.model.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Schedule {

    private String id;

    private LocalDate startDate;

    private LocalDate endDate;

    private String timeDuration;
}
