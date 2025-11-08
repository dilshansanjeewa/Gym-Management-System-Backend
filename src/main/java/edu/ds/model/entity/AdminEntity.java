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
@Table(name="Admin")
public class AdminEntity {

    @Id
    private String id;

    private String name;

    private String email;
}
