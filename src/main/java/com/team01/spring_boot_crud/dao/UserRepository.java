package com.team01.spring_boot_crud.dao;

import com.team01.spring_boot_crud.entity.User;

import java.util.List;

public interface UserRepository {
    //by default all methods in an interface are public and abstract

    //basic crud
    User saveUser(User user);
    User getUserbyId(int id);
    User updateUser(User user);
    List<User> getAllUsers();
    User deleteUserbyId(int id);
}
