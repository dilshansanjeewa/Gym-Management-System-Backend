package edu.ds.model.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Payment {

    private String id;

    private double amount;

    private LocalDate payDate;

}
