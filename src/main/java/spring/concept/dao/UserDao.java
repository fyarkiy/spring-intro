package spring.concept.dao;

import java.util.List;
import spring.concept.model.User;

public interface UserDao {
    void add(User user);

    User getById(Long id);

    List<User> listUsers();
}
