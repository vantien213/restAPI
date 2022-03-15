package com.vantien.thuctap.service;

import java.util.List;

import com.vantien.thuctap.model.User;

public interface UserService {
	Iterable<User> findAll();
    List<User> search(String q);
    User findOne(long id);
    void save(User emp);
    void delete(User emp);
}
