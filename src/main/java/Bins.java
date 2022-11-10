import java.util.TreeMap;

public class Bins {
    private final TreeMap<Integer, Integer> theBins;
    private Integer totalRolls = 0;

    public Bins(final Integer firstBin, final Integer lastBin) {
        theBins = new TreeMap<Integer, Integer>();
        for (Integer i = firstBin; i <= lastBin; i++) {
            theBins.put(i, 0);
            //creates bins of the batch
        }
    }
    public Integer numOfBins() {
        return theBins.size();
    }

    public Integer getSpecificBin(Integer binNumber) {
        return theBins.get(binNumber);
    }

    public void addRollValueToBin(final Integer binNumber) {
        theBins.put(binNumber, theBins.get(binNumber) + 1);
        //searching for correct bin, get current value of bin and add roll (+1)
        totalRolls++; //count simulations
    }

    public float rollPercentagePerBin(Integer binNumber) {
        float percentage = theBins.get(binNumber) / (float) totalRolls;
        return percentage * 100;
    }

}
