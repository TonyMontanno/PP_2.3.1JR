package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    void add(User user);


    void delete(Long id);

    void edit(Long id, User user);

    User getById(Long id);
}
