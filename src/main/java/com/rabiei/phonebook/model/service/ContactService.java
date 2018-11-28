package com.rabiei.phonebook.model.service;

import com.rabiei.phonebook.model.entity.Contact;
import com.rabiei.phonebook.model.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> findall(){
        return contactRepository.findAll();
    }

}
