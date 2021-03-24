package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

    // Разбор домашнего задания в записи посмотрел, все понятно, переписывать не стал)

    private final ArrayList<T> box = new ArrayList<>();

    public Box(T[] fruits) {
        box.addAll(Arrays.asList(fruits));
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : box) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.01;
    }

    public void pourIntoBox(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }
}
