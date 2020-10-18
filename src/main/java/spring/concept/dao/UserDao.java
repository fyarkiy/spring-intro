package spring.concept.dao;

import java.util.List;
import spring.concept.model.User;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}
