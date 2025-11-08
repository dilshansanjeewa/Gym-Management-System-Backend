package edu.ds.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

@Entity
@Table(name = "Schedule")
public class ScheduleEntity {

    @Id
    private String id;

    private LocalDate startDate;

    private LocalDate endDate;

    private String timeDuration;
}
