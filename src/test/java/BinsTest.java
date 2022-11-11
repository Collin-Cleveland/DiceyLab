import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void getSpecificBin() {
        Bins bins = new Bins(2, 12);
        Integer expected = 0;
        Integer actual = bins.getSpecificBin(8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void addRollValueToBin() {
        Bins bins = new Bins(2, 12);
        Integer expected = 1;
        bins.addRollValueToBin(5);
        Integer actual = bins.getSpecificBin(5);
        Assert.assertEquals(expected, actual);
    }
}