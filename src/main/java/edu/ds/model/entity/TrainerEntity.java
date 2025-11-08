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
@Table(name = "Trainer")
public class TrainerEntity {

    @Id
    private String id;

    private String name;

    private String email;

    private String address;

    private String mobile;

    private LocalDate dob;

    private double salary;

    private String qualification;

    private int experienceYear;
}
