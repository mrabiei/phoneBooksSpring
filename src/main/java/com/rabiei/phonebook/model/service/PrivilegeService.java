package com.rabiei.phonebook.model.service;

import com.rabiei.phonebook.model.entity.Privilege;
import com.rabiei.phonebook.model.repository.PrivilegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilegeService {
    @Autowired
    private PrivilegeRepository privilegeRepository;

    public List<Privilege> FindAll() {
        return privilegeRepository.findAll();
    }
}
