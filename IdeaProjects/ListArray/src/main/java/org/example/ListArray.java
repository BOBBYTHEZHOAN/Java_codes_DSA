package org.example;

import java.util.Arrays;

public class ListArray {
    static int[] intArray;
    static int def = 10;
    static int pointer = 0;


    public ListArray() {
        intArray = new int[def];
    }

    public ListArray(int userDef) {
        this.def = userDef;    //this refers to the class, so use of the def value outside is also updated
        intArray = new int[def];
    }

    private void initialise(int length) {
        intArray = new int[length];
    }

    public static void add(int i) {
        if (pointer > intArray.length) {

            int[] temp = intArray;
            intArray = new int[intArray.length + def];
            for (int k = 0; k < temp.length; k++) {
                intArray[k] = temp[k];
            }

        }
        intArray[pointer++] = i;
    }

    public void delete(int index) {
        if (index < 0 && index > def - 1) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int temp[] = new int[intArray.length - 1];
        int k = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (i != index) {
                temp[k++] = intArray[i];
            }
        }
        intArray = temp;
        pointer--;
    }

    public int fetch(int index) {
        return intArray[index];
    }

    public String toString() {
        return Arrays.toString(intArray);

    }

    public int max() {
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i])
                max = intArray[i];
        }
        return max;
    }

    public int[] fetchALL() {
        int temp[] = new int[pointer];
        for (int i = 0; i <pointer; i++) {
            temp[i] = intArray[i];

        }
        return temp;
    }

    public int size() {
        return pointer;
    }

    public static ListArray intersect(ListArray array1, ListArray array2) {
        ListArray list = new ListArray();
        if (array1.size() < array2.size()) {
        }
        for (int i = 0; i < array1.size(); i++) {
            for (int k = 0; k < array2.size(); k++) {
                if (array1.fetch(i) == array2.fetch(k)) {
                    list.add(array1.fetch(i));
                }
            }


        }

        return list;
    }

}
