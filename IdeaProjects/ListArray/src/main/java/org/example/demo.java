package org.example;

public class demo {
    public static void main(String[] args) {
        ListArray listarray = new ListArray();
        listarray.add(10);
        listarray.add(20);
        listarray.add(30);
        System.out.println(listarray.toString());
        System.out.println(listarray.size());
        listarray.delete(2);
        System.out.println(listarray.toString());
        System.out.println(listarray.size());
        System.out.println("the value @ index 2 is "+ listarray.fetch(2));
        System.out.println(listarray.max());
        System.out.println("the run -time complexity of max function on listarray is O(n)");
        ListArray listarray1 = new ListArray();
        listarray1.add(10);
        listarray1.add(30);
        listarray1.add(20);
        ListArray listarray2 = ListArray.intersect(listarray1, listarray);
        System.out.println(listarray2.toString());
    }
}
