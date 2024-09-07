package org.bubble;

public class BubbleSort {
    public <T extends Comparable<T>> void sort(T[] arr) {
        int n = 0;
        while(n != arr.length){
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i].compareTo(arr[i+1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            n++;
        }

    }
}
