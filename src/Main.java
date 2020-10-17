package com.company;

public class Main {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(2);
        myList.add(5);
        myList.add(12);
        myList.add(19);
        myList.add(11);
        myList.add(9);
        System.out.println(myList.toString());
        myList.swap(0,3);
        System.out.println(myList.toString());
        myList.sort();
        System.out.println(myList.toString());
    }
}