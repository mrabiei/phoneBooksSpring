package com.rabiei.phonebook.model.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class BaseService<E> {

    protected abstract JpaRepository getRepository();

    public List<E> list() {
        return getRepository().findAll();
    }

    public long count() {
        return getRepository().count();

    }

    public void save(E e) {
        getRepository().save(e);
    }
}
