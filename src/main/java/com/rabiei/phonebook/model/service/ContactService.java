package com.rabiei.phonebook.model.service;

import com.rabiei.phonebook.model.entity.Contact;
import com.rabiei.phonebook.model.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService extends BaseService<Contact> {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    protected ContactRepository getRepository() {
        return contactRepository;
    }
}
