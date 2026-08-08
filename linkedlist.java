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
        public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);

        int val = tail.value;

        tail = secondLast;
        tail.next = null;

        size--;

        return val;
    }
public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
        
}
public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
           node =  node.next;
        }
    return null;

}
    // Get node at a particular index
    public Node get(int index) {

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
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
