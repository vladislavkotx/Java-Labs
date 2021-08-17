package homework.lab1;

import homework.lab1.MySuperIntegerList;
import homework.lab1.SuperIntegerList;

public class Main {
    public static void main(String[] args) {
        SuperIntegerList myArr = new MySuperIntegerList(new int[] {1, 3, 5});
        myArr.printAll();
        myArr.add(10);
        myArr.printAll();
        myArr.removeByIndex(1);
        myArr.printAll();
        myArr.removeByValue(5);
        myArr.printAll();
        myArr.printAll();
    }
}
