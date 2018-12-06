package com.rabiei.phonebook.model.service;

import com.rabiei.phonebook.model.entity.User;
import com.rabiei.phonebook.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User>{
    @Autowired
    private UserRepository userRepository;

    @Override
    protected JpaRepository getRepository() {
        return userRepository;
    }
}
