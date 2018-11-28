package com.rabiei.phonebook.model.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usersId")
    private int id;

    @NotEmpty(message = "the user could not be empty")
    private String user;

    @NotEmpty(message = "plz input the password")
    @Length(message = "plz input the password at least 8 char length")
    private String pass;

    @NotEmpty(message = "plz type your full name")
    private String fullName;

    @OneToMany()
    Set<Contact> contacts = new HashSet<>();
    

}
