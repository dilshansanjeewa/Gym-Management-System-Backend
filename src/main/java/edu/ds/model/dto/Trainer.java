package edu.ds.model.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Trainer {

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
