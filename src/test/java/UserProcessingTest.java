import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserProcessingTest {

    @Test
    public void getAllMaleUsers() {

        User user1 = new User(1,"Алексей", 22, Sex.MALE);
        User user2 = new User(2, "Николай", 14,Sex.MALE);
        User user3 = new User(3, "Алиса",31,Sex.FEMALE);

        UserProcessing userProcessing = new UserProcessing();
        userProcessing.getAllUsersMap().put(user1.getId(), user1);
        userProcessing.getAllUsersMap().put(user2.getId(), user2);
        userProcessing.getAllUsersMap().put(user3.getId(), user3);

        List<User> actual = userProcessing.getUsers(Sex.MALE);

        List<User> expected = new ArrayList<>();
        expected.add(user1);
        expected.add(user2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllFemaleUsers() {

        User user1 = new User(1,"Алексей", 22, Sex.MALE);
        User user2 = new User(2, "Николай", 14,Sex.MALE);
        User user3 = new User(3, "Алиса",31,Sex.FEMALE);

        UserProcessing userProcessing = new UserProcessing();
        userProcessing.getAllUsersMap().put(user1.getId(), user1);
        userProcessing.getAllUsersMap().put(user2.getId(), user2);
        userProcessing.getAllUsersMap().put(user3.getId(), user3);

        List<User> actual = userProcessing.getUsers(Sex.FEMALE);

        List<User> expected = new ArrayList<>();
        expected.add(user3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAllUsers() {

        User user1 = new User(1,"Алексей", 22, Sex.MALE);
        User user2 = new User(2, "Николай", 14,Sex.MALE);
        User user3 = new User(3, "Алиса",31,Sex.FEMALE);

        UserProcessing userProcessing = new UserProcessing();
        userProcessing.getAllUsersMap().put(user1.getId(), user1);
        userProcessing.getAllUsersMap().put(user2.getId(), user2);
        userProcessing.getAllUsersMap().put(user3.getId(), user3);

        List<User> actual = userProcessing.getUsers();

        List<User> expected = new ArrayList<>();
        expected.add(user1);
        expected.add(user2);
        expected.add(user3);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAllUsersCount() {

        User user1 = new User(1,"Алексей", 22, Sex.MALE);
        User user2 = new User(2, "Николай", 14,Sex.MALE);
        User user3 = new User(3, "Алиса",31,Sex.FEMALE);

        UserProcessing userProcessing = new UserProcessing();
        userProcessing.getAllUsersMap().put(user1.getId(), user1);
        userProcessing.getAllUsersMap().put(user2.getId(), user2);
        userProcessing.getAllUsersMap().put(user3.getId(), user3);

        int actual = userProcessing.getUsersCount();
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMaleUsersCount() {

        User user1 = new User(1,"Алексей", 22, Sex.MALE);
        User user2 = new User(2, "Николай", 14,Sex.MALE);
        User user3 = new User(3, "Алиса",31,Sex.FEMALE);

        UserProcessing userProcessing = new UserProcessing();
        userProcessing.getAllUsersMap().put(user1.getId(), user1);
        userProcessing.getAllUsersMap().put(user2.getId(), user2);
        userProcessing.getAllUsersMap().put(user3.getId(), user3);

        int actual = userProcessing.getUsersCount(Sex.MALE);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getFemaleUsersCount() {

        User user1 = new User(1,"Алексей", 22, Sex.MALE);
        User user2 = new User(2, "Николай", 14,Sex.MALE);
        User user3 = new User(3, "Алиса",31,Sex.FEMALE);

        UserProcessing userProcessing = new UserProcessing();
        userProcessing.getAllUsersMap().put(user1.getId(), user1);
        userProcessing.getAllUsersMap().put(user2.getId(), user2);
        userProcessing.getAllUsersMap().put(user3.getId(), user3);

        int actual = userProcessing.getUsersCount(Sex.FEMALE);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }



    @Test
    public void testGetUsersCount() {
    }
}