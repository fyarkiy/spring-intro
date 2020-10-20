package spring.concept.service;

import java.util.List;
import org.springframework.stereotype.Service;
import spring.concept.dao.UserDao;
import spring.concept.model.User;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
