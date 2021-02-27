
import java.util.ArrayList;

public class Hold {

    private final int maxWeight;
    private final ArrayList<Suitcase> suitcaseList;
    private int totalW;

    public Hold(int maxWeight) {
        this.totalW = 0;
        this.maxWeight = maxWeight;
        this.suitcaseList = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalW <= this.maxWeight) {
            this.suitcaseList.add(suitcase);
            this.totalW += suitcase.totalWeight();
        }
    }

    @Override
    public String toString() {
        return this.suitcaseList.size() + " suitcases" + " (" + this.totalW + " kg)";
    }

    public void printItems() {
        for (Suitcase sc : suitcaseList) {
            sc.printItems();
        }
    }
}
