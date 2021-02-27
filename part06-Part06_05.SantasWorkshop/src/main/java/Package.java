
import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> giftList;

    public Package() {
        this.giftList = new ArrayList<>();
    }

    public void addGift(Gift item) {
        this.giftList.add(item);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Gift gift : giftList) {
            totalWeight += gift.getWeight();
        }

        return totalWeight;
    }

}
