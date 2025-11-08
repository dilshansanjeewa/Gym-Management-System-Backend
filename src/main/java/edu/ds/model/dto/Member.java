package edu.ds.model.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Member {

    private String id;

    private String name;

    private String email;

    private String address;

    private String mobile;

    private LocalDate dob;

    private Double registrationFee;

    private Double BMI;

    private double Subscription;
}
