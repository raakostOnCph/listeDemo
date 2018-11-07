package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Liste liste = new Liste();

        liste.insertFromTail("1");
        liste.insertFromTail("2");
        liste.insertFromTail("3");
        liste.insertFromTail("4");
        liste.insertFromTail("5");

//
//        liste.printFromHead();
//
//        System.out.println(" nu gør vi det den anden vej \n\n");
//
//        liste.PrintFromTail();

        liste.printFromHead();


        System.out.println("");
        System.out.println("");
        System.out.println("");

        liste.removeFromTail();

        liste.printFromHead();


    }
}
