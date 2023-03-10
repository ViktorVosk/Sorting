import Main.Sorting;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


public class QuantityTest {
    @org.junit.Test
    public void testQuantity(){
        for (int i = 0; i <= 10; i++) {
            Assert.assertEquals(i, i);
        }
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testIncorrectQuantity(){
        for (int i = -100; i <= 0; i++) {
            Sorting.setQuantity(i);
        }
        for (int i = 100; i > 10; i--) {
            Sorting.setQuantity(i);
        }

    }
}
