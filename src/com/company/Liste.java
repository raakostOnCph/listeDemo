package com.company;

public class Liste {

    Node head = null;

    Node tail = null;



    public void insertFromhead(String s) {

        Node n = new Node(s);

        insertFromhead(n);

    }


    public void insertFromhead(Node n) {

        if (head == null) {
            head = n;
            tail = n;
        }

        else {
            n.next = head;
            head.previous = n;
            head = n;
        }

    }


    public void printFromHead() {

        Node n = head;

        while (n != null) {

            System.out.println(n.data);
            n = n.next;
        }

    }


    public void insertFromTail(String s) {

        Node n = new Node(s);

        insertFromTail(n);

        }



        public void insertFromTail(Node n) {



            if (head == null) {

                head = n;
                tail = n;
            }
            else {

                n.previous = tail;
                tail.next = n;
                tail = n;

            }


    }

    public void PrintFromTail() {

        Node n = tail;

        while (n != null) {

            System.out.println(n.data);
            n = n.previous;
        }

    }


    public void removeFromHead() {

        if (head == null) { // listen er tom

            System.out.println("listen er tom");
        }

        if (head == tail) { // listen indeholder et element

            head = null;
            tail = null;
        } else {

            head = head.next;
            head.previous = null;


        }

    }


    public void removeFromTail() {

        if(head == null ) {

            System.out.println("listen er tom");

        }
        if(head == tail) { // listen indeholder kun et element som begge peger til

            head = null;
            tail = null;

        } else {
            tail = tail.previous;
            tail.next = null;
        }

    }

// todo 1) lav en funktion der kan indsætte en knude i starten af listen. et kald kunne se sådan du liste.insertFromHead(new Node("Blondie"))

// todo 2) lav en funktion der kan indsætte en knude en enden af listen. så ovenfor

// todo (1-2).1 lav lav funktionerne om så de tager en streng i stedet for en Node. et kald kunne da se sådan du list.insertFromhead("Blondie");

// todo 3) lav en funktion der kan udskrive listen forfra dvs. indholdet i knuderne.

// todo 3.1 lave begge udskrivfunktoner om så de returnere en streng til main, ikke udskriver fra klassen til terminalen.

// todo 4) lav en funktion der kan udskrive listen bagfra.

// todo 5) lav en funktion der kan fjerne den første knude i listen. Husk at listen kan være tom, rumme et element, eller rumme flere elementer.

// todo 6) lav en funktion der kan fjerne den sidste knude i listen. Husk at listen kan være tom, rumme et element, eller rumme flere elementer.

// todo 7) lav en funktion der kan finde en bestemt knude.

// todo 8) lav en funktion der kan opdatere en bestemt knude.

// todo 9) lav en funktion der kan slette en knude som ikke behøver at være den første eller sidste.

// todo 10) lav en funktion der kan indsætte en knude efter en anden.


}
