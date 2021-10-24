import java.util.ArrayList;


public class Box<T extends Fruit>{
    private boolean isFree = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;
    ArrayList<T> arrayList = new ArrayList<>();

    void addFruit(T fruit) {
        if (currentWeight + 1 <= maxWeight) {
            arrayList.add(fruit);
            currentWeight = currentWeight + fruit.getWeight();
            if (arrayList.size() < 1)
                isFree = false;
        } else
            System.out.println("The box is full");
    }

    float getWeight(T fruit) {
        return arrayList.size() * fruit.weight;
    }

    public float getCurrentWeight() {
        return currentWeight;
    }

    boolean compareWeight(T f1, T f2) {
        if (getWeight(f1) == getWeight(f2)) {
            return true;
        } else return false;
    }

    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight) {
            return true;
        }
        return false;
    }
}
