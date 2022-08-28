package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private final EntityManager entityManager;

    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @SuppressWarnings("unchecked")
    public List<User> allUsers() {

        return entityManager.createQuery(" FROM User").getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);

    }

    @Override
    public void delete(Long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }


    @Override
    public void edit(Long id, User user) {

        User edit = entityManager.find(User.class, id);
        edit.setName(user.getName());
        edit.setSurname(user.getSurname());

    }


    @Override
    public User getById(Long id) {

        return entityManager.find(User.class, id);
    }
}


