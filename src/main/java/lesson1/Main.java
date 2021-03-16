package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strArray = {"Cat1", "Dog2", "Horse3", "Cow4"};
        Integer[] intArray = {10, 20, 30, 40, 50};
// 1.
        System.out.println("До:");
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(intArray));

        swapElements(strArray, 0, 2);
        swapElements(intArray, 0, 4);

        System.out.println("\nПосле:");
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(intArray));
// 2.
        System.out.println("\nСписки:");
        ArrayList<Integer> intList = arrayToList(intArray);
        ArrayList<String> strList = arrayToList(strArray);
        System.out.println(intList);
        System.out.println(strList);
// 3.

        Box<Orange> boxOrange1 = new Box<>(new Orange[]{new Orange(), new Orange(), new Orange()});
        Box<Orange> boxOrange2 = new Box<>(new Orange[]{new Orange(), new Orange()});

        System.out.println("\nВеса коробок:");
        System.out.println(boxOrange1.getWeight());
        System.out.println(boxOrange2.getWeight());

        System.out.println("\nСравнение коробок:");
        System.out.println(boxOrange1.compare(boxOrange2));
        boxOrange2.addFruit(new Orange());
        System.out.println(boxOrange1.compare(boxOrange2));

        System.out.println("\nПересыпаем из одной коробки в другую и взвешиваем: ");
        boxOrange1.pourIntoBox(boxOrange2);
        System.out.println(boxOrange1.getWeight());
        System.out.println(boxOrange2.getWeight());
    }

    public static <T> void swapElements(T[] array, int firstElement, int secondElement) {
        T tempElement = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = tempElement;
    }

    public static <T> ArrayList<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
