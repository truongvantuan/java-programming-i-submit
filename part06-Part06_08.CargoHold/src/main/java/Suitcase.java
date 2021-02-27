
import java.util.ArrayList;

public class Suitcase {

    private final int maxWeight;
    private final ArrayList<Item> listItem;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.listItem = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.listItem.add(item);
        }
    }

    @Override
    public String toString() {
        if (this.listItem.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.listItem.size() == 1) {
            return this.listItem.size() + " item (" + this.totalWeight() + " kg)";
        }

        return this.listItem.size() + " items (" + this.totalWeight() + " kg)";
    }

    public int totalWeight() {
        int totalW = 0;
        totalW = listItem.stream().map((it) -> it.getWeight()).reduce(totalW, Integer::sum);
        return totalW;
    }

    public Item heaviestItem() {
        if (this.listItem.isEmpty()) {
            return null;
        }
        
        Item returnItem = this.listItem.get(0);
        for (Item it : listItem) {
            if (returnItem.getWeight() < it.getWeight()) {
                returnItem = it;
            }
        }
        return returnItem;
    }

    public void printItems() {
        listItem.forEach((it) -> {
            System.out.println(it.getName() + " (" + it.getWeight() + " kg)");
        });
    }

}
