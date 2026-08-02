package Basics;

import org.w3c.dom.Node;

public class Ll {
    private Node head;
    private Node tail;
    private int size;
    public Ll(){
        this.size = 0;
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
