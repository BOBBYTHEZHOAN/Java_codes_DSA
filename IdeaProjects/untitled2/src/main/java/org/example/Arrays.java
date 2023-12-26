package org.example;

//import java.util.Arrays;



public class Arrays{
    int[] array;
    int def = 10;
    int point =0;
    public Arrays(int size){
        array = new int[size];

    }
    public Arrays(){
        array = new int[def];
    }

    public void add(int value){
        if(point < def) {
            array[point++] = value;
        }
        else{
            int [] temp = array;
            array = new int[array.length +def];
            for(int i=0;i < temp.length;i++){
                array[i] = temp[i];
            }
            array[point++] = value;
            def++;
        }
    }


    public static void main(String[] args) {
        Arrays_1 arr = new Arrays_1();
        for(int i=0;i<20;i++) {
            arr.add(i);
        }



    }


}
