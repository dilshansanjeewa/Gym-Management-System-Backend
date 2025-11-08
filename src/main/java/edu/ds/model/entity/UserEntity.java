package edu.ds.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

@Entity
@Table(name = "User")
public class UserEntity {

    @Id
    private String d;

    private String userName;

    private String password;

    private String role;
}
