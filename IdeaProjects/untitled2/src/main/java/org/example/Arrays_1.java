package org.example;

import java.util.Arrays;



public class Arrays_1{
    int[] array;
    int def = 10;
    int point =0;
    public Arrays_1(int size){
        array = new int[size];

    }
    //public void print(int [] array){
    //    System.out.println(Arrays.toString(array));
    //}

    public Arrays_1(){
        array = new int[def];
    }

    public void print(){

    }

    public void add(int value){
        if(point < array.length) {
            array[point++] = value;
        }
        else{
            int [] temp = array;
            array = new int[array.length +def];
            for(int i=0;i < temp.length;i++){
                array[i] = temp[i];
            }
            array[point++] = value;

            System.out.println(Arrays.toString(array));
        }
    }


    public static void main(String[] args) {
         Arrays_1 arr1 = new Arrays_1();
        for(int i=0;i<20;i++) {
            arr1.add(i);
        }


        //arr.print;



    }


}
