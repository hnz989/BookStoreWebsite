package com.example.bookstorewebsite.dao;

import jakarta.persistence.EntityManager;
import com.example.bookstorewebsite.entity.UsersEntity;

import java.util.List;

public class UserDAO extends JpaDAO<UsersEntity> implements GenericDAO<UsersEntity>{

    public UserDAO(EntityManager entityManager) {
        super(entityManager);
    }
    public UsersEntity create(UsersEntity user){
        return super.create(user);
    }
    @Override
    public UsersEntity update(UsersEntity user) {
        return super.update(user);
    }

    @Override
    public UsersEntity get(Object id) {
        return null;
    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<UsersEntity> listAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
