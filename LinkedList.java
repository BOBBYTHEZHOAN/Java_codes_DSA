package org.example;


public class LinkedList {


    private class Node {
        private int value;
        private Node next;

        public Node(int Value) {
            this.value = value;
        }
    }


    private Node first;
    private Node last;


    public void addLast(int item) {
        Node node = new Node(item);

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;


        }
    }
    public void print() {
        Node currnode = new Node(1);
        currnode = first;

        while(currnode!=null)
        {
            System.out.println(currnode.value);
            currnode=currnode.next;
        }







    }



    public void addFirst(int item) {
        Node node = new Node(item);
        if (first == null)
            first = last = node;
        else {
            node.next = first;
            first.next = node;
        }

    }
}
