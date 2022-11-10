import com.example.bookstorewebsite.entity.UsersEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UsersTest {
    public static void main(String[] args) {
        UsersEntity user1 = new UsersEntity();
        user1.setEmail("bond123@apple.com");
        user1.setFullName("James Bond");
        user1.setPassword("leetcode123");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Begin Transaction
        entityManager.getTransaction().begin();
        entityManager.persist(user1);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        System.out.println("A User Object is persisted!");


    }
}

