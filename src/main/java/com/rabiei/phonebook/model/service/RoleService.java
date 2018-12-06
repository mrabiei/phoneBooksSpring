package com.rabiei.phonebook.model.service;

import com.rabiei.phonebook.model.entity.Role;
import com.rabiei.phonebook.model.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService extends BaseService<Role> {
    @Autowired
    private RoleRepository roleRepository;


    @Override
    protected JpaRepository getRepository() {
        return roleRepository;
    }
}
