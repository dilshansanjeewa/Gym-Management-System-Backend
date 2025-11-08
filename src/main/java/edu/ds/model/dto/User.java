package edu.ds.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {

    private String userId;

    private String userName;

    private String password;

    private String role;
}
