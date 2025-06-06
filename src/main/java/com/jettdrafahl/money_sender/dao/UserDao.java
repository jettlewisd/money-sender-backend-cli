package com.jettdrafahl.money_sender.dao;
import com.jettdrafahl.money_sender.model.User;

import java.util.List;

public interface UserDao {
    User getUserById(Long id);
    List<User> getAllUsers();
    User findByUsername(String username);
    Long createUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(Long id);
}
