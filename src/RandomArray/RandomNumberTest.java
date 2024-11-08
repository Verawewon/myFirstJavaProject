package RandomArray;

import LogIn.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomNumberTest {
    @Test
    void randomNumberGenerator() {
        RandomNumberGenerator rng= new RandomNumberGenerator();
        assertEquals(50,rng.random(97,99));

    }
}
