import java.util.TreeMap;

public class Bins {
    private TreeMap<Integer, Integer> theBins;
    private Integer totalRolls = 0;

    public Integer firstBin = Dice.numOfDice;
    public Integer lastBin = Dice.numOfDice * 6;

    public Bins(final Integer firstBin, final Integer lastBin) {
        theBins = new TreeMap<Integer, Integer>(); // treeMap for sorted keys values in ascending order
        for (Integer i = firstBin; i <= lastBin; i++) {
            theBins.put(i, 0);
            //creates bins to be used for storing roll outcomes
        }
    }
    public Integer numOfBins() {

        return theBins.size();
    }

    public Integer getSpecificBin(Integer binNumber) {

        return theBins.get(binNumber); // gets individual bin
    }

    public void addRollValueToBin(Integer binNumber) {
        theBins.put(binNumber, theBins.get(binNumber) + 1);
        //searching for correct bin, get current value of bin and add roll (+1)
        totalRolls++; //add 1 to total rolls in simulation
    }
    public float rollPercentagePerBin(Integer binNumber) {
        float percentage = theBins.get(binNumber) / (float) totalRolls; //get individual bin and divide by total rolls
        return percentage * 100;
    }

}
