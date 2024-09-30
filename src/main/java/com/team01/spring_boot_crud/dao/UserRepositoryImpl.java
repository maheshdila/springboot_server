package com.team01.spring_boot_crud.dao;

import com.team01.spring_boot_crud.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepositoryImpl implements UserRepository {
    //private static final String INSERT_USER_QUERY

    private JdbcTemplate jdbcTemplate;
    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User getUserbyId(int id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User deleteUserbyId(int id) {
        return null;
    }
}
