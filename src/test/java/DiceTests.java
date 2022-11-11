

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DiceTests {

    @Test
    public void testDice() {
        Dice dice = new Dice(2);
        ArrayList<Integer> randomSum = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < 100; i++) {
            randomSum.add(Dice.tossAndSum());
        }
        for (int i = 0; i < randomSum.size(); i++) {
            if (i < 2 || i > 12) {
                break;
            } else {
            }
            counter++;

            Assert.assertTrue(counter == 100);
        }
    }

    @Test
    public void testDice2() {
        Dice dice = new Dice(2);
        ArrayList<Integer> randomSum = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < 1000; i++) {
            randomSum.add(Dice.tossAndSum());
        }
        for (int i = 0; i < randomSum.size(); i++) {
            if (i < 2 || i > 12) {
                break;
            } else {
            }
            counter++;

            Assert.assertTrue(counter == 1000);
        }
    }

    @Test
    public void constructorTest() {
        int expected = 2;
        Dice dice = new Dice(2);
        int actual = dice.numOfDice;
        Assert.assertEquals(expected, actual);
    }
}