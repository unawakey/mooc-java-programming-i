
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        items = new ArrayList<>();  
        this.maxWeight = maxWeight;
        totalWeight = 0;
    }

    public void addItem(Item item) {
        if (item.getWeight() + totalWeight <= maxWeight) {
            items.add(item);
            totalWeight += item.getWeight();
        }
    }
    
    public int totalWeight() {
        return totalWeight;
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);
        int heaviest = items.get(0).getWeight();
        for (int i = 1; i < items.size(); i++) {
            if (items.get(i).getWeight() > heaviest) {
                heaviestItem = items.get(i);
                heaviest = items.get(i).getWeight();
            }
        }
        
        return heaviestItem;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        }
        
        return items.size() + " items (" + totalWeight + " kg)";
    }

}
