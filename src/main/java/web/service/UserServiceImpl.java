package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    @Transactional(readOnly = true)
    public List<User> allUsers() {
        return userDAO.allUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDAO.add(user);
    }

    @Transactional
    @Override
    public void edit(Long id, User user) {
        userDAO.edit(id, user);
    }


    @Override
    @Transactional(readOnly = true)
    public User getById(Long id) {
        return userDAO.getById(id);
    }

    @Transactional
    @Override
    public void delete(Long id, User user) {
        userDAO.delete(id);

    }
}
