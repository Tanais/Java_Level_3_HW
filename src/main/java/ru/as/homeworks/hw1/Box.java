package ru.as.homeworks.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruits> {

    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Box(T... obj) {
        list = Arrays.asList(obj);
    }

    public Box() {
        list = new ArrayList<T>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveAt(Box<T> box) {
        if (this.list.isEmpty()) {
            System.out.println("Nothing to spill. The box is empty.");
        } else {
            box.getList().addAll(list);
            list.clear();
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }


    void compare(Box<? extends Fruits> box) {
      if (this.getWeight() == box.getWeight()){
          System.out.println("The weight of the boxes is the same");
      } else {
          System.out.println("The weight of the boxes is not the same");
      }
    }
}
