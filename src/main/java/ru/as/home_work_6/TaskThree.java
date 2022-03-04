package ru.as.home_work_6;

public class TaskThree {

    public static void main(String[] args) {
        final boolean result = run(new int[]{1, 1, 1, 1, 1});
        System.out.println(result);
    }


    public static boolean run(int[] arrIn) {
        boolean one = false;
        boolean four = false;
        for (int i : arrIn) {
            if (i != 1 && i != 4) throw new RuntimeException("invalid value");
            if (i == 1) one = true;
            if (i == 4) four = true;
        }
        return one && four;
    }
}




