package com.upgrad.hireWheel.daos;

import com.upgrad.hireWheel.entities.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository ("usersDAO")
public class usersDAOImpl implements usersDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public Users saveUsers(Users users) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(users);
        entityManager.getTransaction().commit();
        entityManager.close();
        return users;
    }

    @Override
    public int findByRoleId(int roleId) {
        return 0;
    }

    @Override
    public Users findByEmail(String email) {
        return null;
    }

    @Override
    public Users findByPassword(String password) {
        return null;
    }

    @Override
    public Users findByEmailAndPassword(String email, String password) {
        return null;
    }

 

}
