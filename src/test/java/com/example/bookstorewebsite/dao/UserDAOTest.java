package com.example.bookstorewebsite.dao;

import com.example.bookstorewebsite.entity.UsersEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;
import org.junit.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class UserDAOTest {

//    private static EntityManagerFactory entityManagerFactory;
//    private static EntityManager entityManager;
//    private static UserDAO userDAO;

//    @Before
//    public static void setUpClass() throws Exception{
//        entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
//        entityManager = entityManagerFactory.createEntityManager();
////        userDAO = new UserDAO(entityManager);
//    }

    @org.junit.jupiter.api.Test
    void createUsers() {
        UsersEntity user1 = new UsersEntity();
        user1.setEmail("Jacky@apple.com");
        user1.setFullName("Jacky Cheng");
        user1.setPassword("jacky123");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        UserDAO userDAO = new UserDAO(entityManager);
        user1 = userDAO.create(user1);
        entityManager.close();
        entityManagerFactory.close();

        assertTrue(user1.getUserId()>0);
    }

//    @Test(expected = PersistenceException.class)
    @Test
    public void testCreateUsersFieldsNotSet(){

        UsersEntity user1 = new UsersEntity();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        UserDAO userDAO = new UserDAO(entityManager);
        user1 = userDAO.create(user1);

        entityManager.close();
        entityManagerFactory.close();

        assertTrue(user1.getUserId()>0);
    }

    @Test
    public void testUpdateUsers(){
        UsersEntity user1 = new UsersEntity();
        user1.setUserId(21);
        user1.setEmail("JackBond@apple.com");
        user1.setFullName("Jack Bond");
        user1.setPassword("bond123");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        UserDAO userDAO = new UserDAO(entityManager);
        user1 = userDAO.update(user1);
        entityManager.close();
        entityManagerFactory.close();

        String expected = "bond123";
        assertEquals(expected, user1.getPassword());
    }

//    @After
//    public static void closeClass() throws Exception {
//        entityManager.close();
//        entityManagerFactory.close();
//    }
}