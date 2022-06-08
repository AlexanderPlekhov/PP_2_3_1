package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void updateUser(Long id, User user);
    void saveUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
}
