package ua.lvlup.homework;

import java.util.Scanner;

public class Sorter {

    public int[] sort(int[] array){
        if(isBubbleSort()){
            return new BubbleSort().sort(array);
        } else {
            return new SelectionSort().sort(array);
        }
    }

    private boolean isBubbleSort(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, select option number: \n1.Bubble sort\n2.Selection sort");
        while(true) {
            int scanned = scan.nextInt();
            if (scanned == 1) {
                return true;
            } else if (scanned == 2) {
                return false;
            } else {
                System.out.println("Enter correct number of option:");
            }
        }
    }
}
