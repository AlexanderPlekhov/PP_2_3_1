package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {return userDao.getAllUsers();}

    @Override
    public void updateUser(Long id, User user) {userDao.updateUser(id, user);}

    @Override
    public void saveUser(User user) {userDao.saveUser(user);}

    @Override
    public void deleteUserById(Long id) {userDao.deleteUserById(id);}

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {return userDao.getUserById(id);}
}
