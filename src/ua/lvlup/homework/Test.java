package ua.lvlup.homework;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[] {10, 23, 11, 2, 9, 67};
        System.out.println("By bubble sort: " + Arrays.toString(new Sorter().sort(new BubbleSort(), array)));
        System.out.println("By selection sort: " + Arrays.toString(new Sorter().sort(new SelectionSort(), array)));
    }
}
