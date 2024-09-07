package org.bubble;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var sort = new BubbleSort();
        Runnable sortint = () -> {
            Integer[] arr = new Integer[]{10,123,15,127,7};
            sort.sort(arr);
            System.out.println(Arrays.toString(arr));
        };
        new Thread(sortint).start();

        Runnable sortstring = () -> {
            String[] arrstr = new String[] {"123", "privet", "hi", "белки"};
            sort.sort(arrstr);
            System.out.println(Arrays.toString(arrstr));
        };
        new Thread(sortstring).start();



    }
}