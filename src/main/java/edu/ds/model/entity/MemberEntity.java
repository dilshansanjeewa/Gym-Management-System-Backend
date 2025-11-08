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
@Table(name = "Member")
public class MemberEntity {

    @Id
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
