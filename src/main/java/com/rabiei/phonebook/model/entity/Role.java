package com.rabiei.phonebook.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "roles")
public class Role {


    @JsonIgnore
    @ToString.Exclude
    @JsonIgnoreProperties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roles_id")
    private Integer id;


    @NotEmpty
    private String name;

    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    private Set<Privilege> privileges;

    @OneToMany(mappedBy = "role")

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<User> users = new HashSet<>();


    public Role() {
    }

    public Role(@NotEmpty String name, Set<Privilege> privileges, Set<User> users) {
        this.name = name;
        this.privileges = privileges;
        this.users = users;
    }
}
