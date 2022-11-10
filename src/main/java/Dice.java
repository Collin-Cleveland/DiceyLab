import java.util.Random;

public class Dice {

    public int numOfDice;
    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }
    public int tossAndSum(){
        Random rand = new Random();
        int randomSum = 0;
        for (int i = 1; i <= numOfDice; i++) {
            randomSum += rand.nextInt(6) + 1;
        }
        return randomSum;
    }
}
