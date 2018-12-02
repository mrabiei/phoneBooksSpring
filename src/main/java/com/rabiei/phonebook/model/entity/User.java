package com.rabiei.phonebook.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity

@Table(name = "users")
public class User implements Serializable {


    @JsonIgnore
    @ToString.Exclude

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



    @OneToMany( mappedBy = "users")
     private Set<Contact> contacts ;


    @ManyToOne()
    @JoinColumn(name = "roleId", nullable = false)
    private Role role;


    public User() {
    }


    public User(@NotEmpty(message = "the user could not be empty") String user, @NotEmpty(message = "plz input the password") @Length(message = "plz input the password at least 8 char length") String pass, @NotEmpty(message = "plz type your full name") String fullName, Set<Contact> contacts, Role role) {
        this.user = user;
        this.pass = pass;
        this.fullName = fullName;
        this.contacts = contacts;
        this.role = role;
    }
}
