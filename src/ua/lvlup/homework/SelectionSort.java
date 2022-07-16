package ua.lvlup.homework;

public class SelectionSort implements Sort{
    @Override
    public int[] sort(int[] array) {
        int min;
        int minPos;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            minPos = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min){
                    min = array[j];
                    minPos = j;
                }
            }
            array[minPos] =array[i];
            array[i] = min;
        }
        return array;
    }
}
