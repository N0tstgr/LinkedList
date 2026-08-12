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
        public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.val == value){
                return node;
            }
            node =  node.next;
        }
        return null;

    }

public void insert(int after, int val){
    Node p = find(after);
    if(p==null){
        System.out.println("Does not Exist");
        return;
    }
    Node node = new Node(val);
    node.next = p.next;
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
