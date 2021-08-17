package com.db;


import homework.lab1.MySuperIntegerList;
import homework.lab1.SuperIntegerList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SuperIntegerList myArr = new MySuperIntegerList(new int[] {1, 3, 5});
        myArr.printAll();
        myArr.add(10);
        myArr.printAll();
        myArr.removeByIndex(1);
        myArr.printAll();
        myArr.removeByValue(5);
        myArr.printAll();
    }
}
