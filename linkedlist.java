package Basics;

import org.w3c.dom.Node;

public class Ll {
    private Node head;
    private Node tail;
    private int size;
    public Ll(){
        this.size = 0;
    }
    public void insert(int val, int index){
        if(index==0){
            InsertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
    for (int i = 1; i <index ; i++) {
        temp = temp.next;
    }
    Node node = new Node(val, temp.next);
    temp.next = node;
    size++;
}
     public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(" END ");
    }
    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size = size + 1;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public void Node(int value, int next){
        this.value = value;
        this.next = next;
    }


}
