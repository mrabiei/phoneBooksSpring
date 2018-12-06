package com.rabiei.phonebook.web.controller;


import com.rabiei.phonebook.model.entity.Contact;
import com.rabiei.phonebook.model.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    ContactService contactService;

    @RequestMapping(method = RequestMethod.GET, path = "/find", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    // @GetMapping(value = "/find")
    public List<Contact> showAll() {

        return contactService.list();
    }

    @PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity save(@RequestBody Contact contact) {

        contactService.save(contact);
        return ResponseEntity.status(201).build();

    }

}
