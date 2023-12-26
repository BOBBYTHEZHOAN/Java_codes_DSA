package org.example;

import java.util.Arrays;


public class Arrays2 {
    int[] array;
    int def = 10;
    int point = 0;


    public Arrays2(int size) {
        array = new int[size];

    }
    //public void print(int [] array){
    //    System.out.println(Arrays.toString(array));
    //}

    public Arrays2() {
        array = new int[def];
    }

    //exercise_2_method_1
    public static void intersect1(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];


        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr[k++] = arr1[i];
                }

            }


        }
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                n++;
            }
        }
        int[] arrt = new int[n];
        System.out.println(Arrays.toString(arrt));
        System.arraycopy(arr, 0, arrt, 0, n);

        System.out.println(Arrays.toString(arrt));

    }
/*    public int [] getallvalues(){
        int [] temp = new int[point];
        return for()
    }
*/
    public static void main(String[] args) {
        Arrays2 arr1 = new Arrays2();
        Arrays2 arr2 = new Arrays2();
        int[] array1 = {22, 33, 44, 52, 66};
        int[] array2 = {21, 33, 42, 55, 66};
        for (int j = 5; j < 60; j = j + 6) {
            arr2.add(j);
        }
        for (int i = 0; i < 20; i++) {
            arr1.add(i);
        }

        arr1.print();
        arr1.length();
        System.out.println(arr1.max());
        arr2.print();
        arr2.length();
        System.out.println(arr2.max());
        intersect1(array1, array2);
        intersect1(arr1.send(), arr2.send());
        arr1.reverse();
        arr2.insertAt(3, 5);


    }

    public void print() {
        System.out.println(Arrays.toString(array));

    }

    //exercise_1 ----Has runtime complexity of O(n)
    public int max() {
        int maximus = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximus) maximus = array[i];

        }
        return maximus;

    }

    //exercise_2_method_2
    public int length() {
        int i = 0;
        for (int num : array) {

            i++;

        }
        System.out.println("Total Size Of Array :" + i);

        return i;
    }

    /*public static void intersect2(Arrays2 arr1 , Arrays2 arr2){
        Arrays2 arr6 = new Arrays2();
        for (int i = 0; i < arr1.length(); i++) {

            for (int j = 0; j < arr2.length(); j++) {

               if(arr1[i] == arr2[j]){        //write get() function, so data can be manipulated in Arrays2 datatype, so the error array type is expected is avoided
                                               //Also arr6 can be of size 1, which can then be extended using .add() method
                   arr6[i] = arr1[i];
               }

            }
        }
        arr6.print();
    }
    */

    //exercise_3

    public int[] send() {
        return array;
    }

    public void reverse() {
        int n = array.length;
        int t = 0;
        for (int i = 0; i < n / 2; i++) {
            t = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = t;
        }
        System.out.println(Arrays.toString(array));
    }

    //exercise_4
    public void insertAt(int index, int element) {
        int[] temp = array;
        int n = array.length;
        //System.out.println(Arrays.toString(temp));
        // System.out.println(index);
        array = new int[array.length + 1];
        //System.out.println(Arrays.toString(array));
        int k = 0;
        int i;
        for (i = 0; i < index; ) {
            array[k++] = temp[i++];
        }
        array[k++] = element;

        for (i = index; i < n; ) {
            array[k++] = temp[i++];
        }
        System.out.println(Arrays.toString(array));

    }

    public void add(int value) {
        if (point < array.length) {
            array[point++] = value;
        } else {
            int[] temp = array;
            array = new int[array.length + def];
            System.arraycopy(temp, 0, array, 0, temp.length);
            array[point++] = value;


        }
    }


}

