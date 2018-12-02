package com.rabiei.phonebook.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "priviliegs")
public class Privilege {

    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "privilegsId")
    private Integer id;


    @NotEmpty
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Role> roles =new HashSet<>();

    public Privilege() {
    }

    public Privilege(@NotEmpty String name, Set<Role> roles) {
        this.name = name;
        this.roles = roles;
    }
}
