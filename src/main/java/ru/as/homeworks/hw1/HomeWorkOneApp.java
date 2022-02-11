package ru.as.homeworks.hw1;




import java.util.ArrayList;
import java.util.Arrays;


public class HomeWorkOneApp
{
    public static void main(String[] args )
    {
        String[] testArr = new String[] {"abc", "cba", "x", "y"};
        System.out.println(Arrays.toString(testArr));
        swapElements(testArr, 2,3);
        System.out.println(Arrays.toString(testArr));

        ArrayList<String> list = arrayToArrayList(testArr);
        System.out.println("\n" + list.getClass());

        //3. Задача 3.
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        appleBox1.add(new Apple());
        orangeBox1.add(new Orange());

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        appleBox.compare(orangeBox);
        appleBox1.compare(orangeBox1);

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.moveAt(appleBox);


    }

//1. Написать метод,
//который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

    public static <T> void swapElements(T[] arr, int firstElement, int secondElement){
        T buffer = arr [firstElement];
        arr[firstElement] = arr [secondElement];
        arr[secondElement] = buffer;
    }

//2. Написать метод, который преобразует массив в ArrayList;

    public static <E> ArrayList<E> arrayToArrayList (E[] arr){
        ArrayList<E> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(i, arr[i]);
        }
        return arrayList;
     }
}
