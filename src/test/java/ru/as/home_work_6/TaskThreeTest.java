package ru.as.home_work_6;


import org.junit.Assert;
import org.junit.Test;

public class TaskThreeTest {


    @Test(expected = RuntimeException.class)
    public void testOneTaskThree() {
        Assert.assertFalse("В массиве только 1 и 4", TaskThree.run(new int[]{1, 4, 2}));
    }

    @Test(timeout = 1000)
    public void testTwoTaskThree() {
        int[] data = new int[900000];
        data[0] = 1;
        data[1] = 1;
        for (int i = 2; i < data.length; i++) {
            final double sin = Math.sin(i);
            data[i] = sin > 0.5 ? 1 : 4;
        }
        Assert.assertTrue("Ошибка", TaskThree.run(data));
    }

    @Test
    public void testThreeTaskThree() {
        Assert.assertFalse("В массиве есть 1", TaskThree.run(new int[]{4, 4, 4, 4, 4}));
    }

    @Test
    public void testFourTaskThree() {
        Assert.assertFalse("В массиве есть 4", TaskThree.run(new int[]{1, 1, 1, 1, 1}));

    }

}
