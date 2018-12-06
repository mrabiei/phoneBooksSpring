package com.rabiei.phonebook.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "contacts")
public class Contact {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contatct_id")
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

    @ManyToOne()
    @JoinColumn(name = "users_id", nullable = false)//its the same as foreign key

    @JsonIgnore
    @ToString.Exclude
    private User users ;


    public Contact() {
    }

    public Contact(@NotEmpty @Length(min = 2, message = "plz input the name more than 2 char ") String firstname, String lastname, @NotEmpty String tel, @Email String email, String address, User users) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.tel = tel;
        this.email = email;
        this.address = address;
        this.users = users;
    }
}
