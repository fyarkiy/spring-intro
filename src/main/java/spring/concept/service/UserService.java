package spring.concept.service;

import java.util.List;
import spring.concept.model.User;

public interface UserService {
    void add(User user);

    User getById(Long id);

    List<User> listUsers();
}
