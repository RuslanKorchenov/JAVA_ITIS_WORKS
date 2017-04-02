
package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addToEnd(1);
        linkedList.addToEnd(2);
        linkedList.addToEnd(3);
        linkedList.addToEnd(4);
        linkedList.addToEnd(5);
        linkedList.addToEnd(6);
        linkedList.addToEnd(7);
        linkedList.addToEnd(8);
        linkedList.addToEnd(9);

        System.out.println(linkedList.getByIndex(3));

    }
}