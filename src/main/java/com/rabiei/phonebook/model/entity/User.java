package com.rabiei.phonebook.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity

@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id")
    private int id;

    @NotEmpty(message = "the user could not be empty")
    private String username;

    @NotEmpty(message = "plz input the password")
    @Length(message = "plz input the password at least 8 char length")
    private String password;

    @NotEmpty(message = "plz type your full name")
    private String fullName;

    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Contact> contacts = new HashSet<>();


    @ManyToOne()
    @JoinColumn(name = "role_id", nullable = false)

    @JsonIgnore
    @ToString.Exclude
    private Role role;

    public User() {
    }

    public User(@NotEmpty(message = "the user could not be empty") String username, @NotEmpty(message = "plz input the password") @Length(message = "plz input the password at least 8 char length") String password, @NotEmpty(message = "plz type your full name") String fullName, Role role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
    }
}
