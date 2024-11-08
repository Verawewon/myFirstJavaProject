package LogIn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogInTest {

    @Test
    void getUser() {
        User user1 = new User("hello","world");
        assertEquals("hello", user1.getUser());

    }

    @Test
    void getPassWord() {
        User user1 = new User("hello","world");
        assertEquals("world", user1.getPassWord());

    }

    @Test
    void renameHelloMyFriend() {
        User user1 = new User("hello","world");
        assertEquals("helloMyFriend", user1.rename("helloMyFriend"));

    }
    @Test
    void renameHEL() {
        User user1 = new User("hello","world");
        assertEquals("hello", user1.rename("hel"));
    }

    @Test
    void renameHELL() {
        User user1 = new User("hello","world");
        assertEquals("hell", user1.rename("hell"));
    }

    @Test
    void updatePassword() {
        User user1 = new User("hello","world");
        assertEquals("mypassword", user1.updatePassword("mypassword"));
    }
}
