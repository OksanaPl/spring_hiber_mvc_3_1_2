package com.example.spring_hiber_mvc_312.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull(message = "firstName must not be null")
    @Pattern(regexp = "[a-zA-Z]*", message = "firstName must not contain special characters")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @NotNull(message = "lastName must not be null")
    @Pattern(regexp = "[a-zA-Z]*", message = "lastName must not contain special characters")
    @Column(name = "last_name")
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
