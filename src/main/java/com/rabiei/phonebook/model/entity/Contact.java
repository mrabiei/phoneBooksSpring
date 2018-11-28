package com.rabiei.phonebook.model.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ContatctId")
    private Integer id;


    @NotEmpty
    @Length(min = 2, message = "plz input the name more than 2 char ")
    private String firstname;
    private String lastname;

    @NotEmpty
    private String tel;

    @Email
    private String email;
    private String address;


}
