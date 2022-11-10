public class Simulation {
    public int numOfTosses;
    public int numOfDice;
    public Bins bin = new Bins(2, 12); //creates map of bins

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSim();
        sim.printSim();

    }

    public Simulation(int numOfDice, Integer numOfTosses) {
        this.numOfTosses = numOfTosses;
        this.numOfDice = numOfDice;
    }

    public void runSim() {
        Dice dice = new Dice(numOfDice); //create dice object and create number of die
        int result;

        for (int i = 0; i < numOfTosses; i++) {
            result = dice.tossAndSum(); //rolls dice and gets sum
            bin.addRollValueToBin(result); //save and add into bin
        }
    }

    public void printSim() {
        for (int i = 2; i <=12; i++){
            System.out.println(String.format("Bin %2s | %6s | %6.2f %% | %2s ", i, bin.getSpecificBin(i).toString(), bin.rollPercentagePerBin(i), printStarGraph(i)));
        }
    }

    public String printStarGraph(int binNumber){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.round(bin.rollPercentagePerBin(binNumber)); i++){
            sb.append("*");
        }
        return sb.toString();
    }
}


