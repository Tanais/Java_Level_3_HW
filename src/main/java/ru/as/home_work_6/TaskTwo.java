package ru.as.home_work_6;

public class TaskTwo {

    public static void main(String[] args) {
        final int[] arr = task2(new int[]{1, 2, 3, 4, 5, 6,4 , 7, 8});
        System.out.println(arr);
    }


    public static int[] task2(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i] == 4) {
                int[] outArray = new int[arr.length -1 - i];
                int k=0;
                for (int j = i+1; j < arr.length; j++) {
                    outArray[k] = arr[j];
                    System.out.println(outArray[k] + " ");
                    k++;
                }
                return outArray;
            }
        }
        throw new RuntimeException("Four(4) not found");
    }
}
