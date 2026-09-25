/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        int nl = 0;
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        ListNode currenti = head;
        for(int i = 0; i<count/2; i++){
            currenti = currenti.next;
        }

        return currenti;
        
    }
}
