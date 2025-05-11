package com.code.api.sharktank.services;
import java.util.List;
import java.util.Optional;

import com.code.api.sharktank.models.User;

public interface IUserService {
    User registerUser(User user);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByEmail(String email);
    void deleteUser(Long id);
	List<User> getAllUsers();
	User updateUser(Long id, User user);
}
