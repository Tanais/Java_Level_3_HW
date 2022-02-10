package ru.as.homeworks.hw1;

//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
//2. Написать метод, который преобразует массив в ArrayList;
//3. Большая задача:
//   a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//   b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//   c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//   d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//   e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//   f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//   g. Не забываем про метод добавления фрукта в коробку.


import java.util.ArrayList;
import java.util.Arrays;

public class HomeWorkOneApp
{


    public static void main(String[] args )
    {
//        String[] testArr = new String[] {"abc", "cba", "x", "y"};
//        System.out.println(Arrays.toString(testArr));
//        swapElements(testArr, 2,3);
//        System.out.println(Arrays.toString(testArr));
//
//        ArrayList<String> list = arrayToArrayList(testArr);
//        System.out.println("\n" + list.getClass());

        //3. Задача 3.

        Apple apple = new Apple();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        orangeBox2.add(new Orange());

        orangeBox2.info();
        orangeBox.moveAt(orangeBox2);
        orangeBox2.info();

        appleBox.compare(orangeBox);








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
