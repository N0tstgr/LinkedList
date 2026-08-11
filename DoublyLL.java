package Basics;

public class DLL {

Node head;

public void insertFirst(int val){
    Node node = new Node(val);
    node.next = head;
    node.prev = null;
    if(head!=null){
        head.prev = node;
    }
    head = node;
    }
    private class Node{
    int value;
    Node next;
    Node prev;

    Node(int value){
        this.value = value;
    }
    }
}
