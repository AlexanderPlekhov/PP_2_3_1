package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void updateUser(Long id, User user);
    void saveUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
}
