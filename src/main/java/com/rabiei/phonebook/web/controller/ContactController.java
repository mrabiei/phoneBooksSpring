package com.rabiei.phonebook.web.controller;


import com.rabiei.phonebook.model.entity.Contact;
import com.rabiei.phonebook.model.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    ContactService contactService;

    @RequestMapping(method = RequestMethod.GET,path = "/find",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
   // @GetMapping(value = "/find")
    public List<Contact> showAll() {

       return contactService.findall();
    }

}
