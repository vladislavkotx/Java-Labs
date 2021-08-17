package homework.lab1;

import java.util.Arrays;

public class MySuperIntegerList implements SuperIntegerList {
    private int [] myArr;


    public MySuperIntegerList(int [] arr) {
        myArr = arr;
    }

    @Override
    public void add(int number) {
        int [] newArr = new int[myArr.length + 1];
        System.arraycopy(myArr, 0, newArr, 0, myArr.length);
        newArr[myArr.length] = number;
        myArr = newArr;
    }

    @Override
    public void removeByIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        if (index >= myArr.length) {
            return;
        }
        int [] newArr = new int[myArr.length - 1];
        if (index >= 0) System.arraycopy(myArr, 0, newArr, 0, index);
        if (this.myArr.length - (index + 1) >= 0) {
            System.arraycopy(myArr, index + 1, newArr, index, myArr.length - index - 1);
        }
        myArr = newArr;
    }

    @Override
    public void removeByValue(int value) {
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == value) {
                this.removeByIndex(i--);
            }
        }
    }

    @Override
    public int get(int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }

        if (index >= myArr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.myArr[index];
    }

    @Override
    public void printAll() {
        for (int i : myArr) {
            System.out.print(i + " ");
        }
    }
}
