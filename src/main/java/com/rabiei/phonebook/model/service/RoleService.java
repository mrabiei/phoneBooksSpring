package com.rabiei.phonebook.model.service;

import com.rabiei.phonebook.model.entity.Role;
import com.rabiei.phonebook.model.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> FindAll() {
        return roleRepository.findAll();


    }

}
