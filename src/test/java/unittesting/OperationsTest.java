package unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class OperationsTest {

    @Disabled("just because")
    @Test
    public void test_addition(){
        Random randomizer = new Random();
        double a = randomizer.nextDouble();
        double b = randomizer.nextDouble();
        double result = (new Operations()).addition(a, b);
        // a+b == result
        Assertions.assertEquals( a + b, result);
    }
}
