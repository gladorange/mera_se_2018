package terletskiy.task1;

public class Barge extends CargoShip{
    private static final int MAX_WEIGHT = 10;
    public Barge(String startLocation, int maxWeight) {
        super(startLocation, maxWeight);
    }
    public Barge(String startLocation) {
        super(startLocation, MAX_WEIGHT);
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }
}
