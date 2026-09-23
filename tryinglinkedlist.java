package Basics;

public class PracticeLinkedlist {
    class Node{
        int value;
        Node next;

    }
    private Node head;

    public  void printall(int n){
        Node first = new Node();
        first.value = 10;

        Node Second = new Node();
        Second.value = 20;

        Node Third = new Node();
        Third.value = 30;

        first.next = Second;

        Second.next = Third;

        Node node = head;
        Node current = head;
        while(current!=null){
            System.out.println(current.value);
            current = current.next;
        }

    }
}
