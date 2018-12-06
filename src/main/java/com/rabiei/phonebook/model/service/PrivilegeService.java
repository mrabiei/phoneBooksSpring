package com.rabiei.phonebook.model.service;

import com.rabiei.phonebook.model.entity.Privilege;
import com.rabiei.phonebook.model.repository.PrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilegeService extends BaseService<Privilege>{
    @Autowired
    private PrivilegeRepository privilegeRepository;


    @Override
    protected JpaRepository getRepository() {
        return privilegeRepository;
    }
}
