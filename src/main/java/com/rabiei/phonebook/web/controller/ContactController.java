package com.rabiei.phonebook.web.controller;


import com.rabiei.phonebook.model.entity.Contact;
import com.rabiei.phonebook.model.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    ContactService contactService;

   // @RequestMapping(method = RequestMethod.GET,path = "/find")
    @GetMapping(value = "/find")
    public List<Contact> showAll(){

        return contactService.findall();
    }

}
