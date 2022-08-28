package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    public void add(User user);
    public void edit(Long id,User user);
    public User getById(Long id);

    public void delete(Long id, User user);


}
