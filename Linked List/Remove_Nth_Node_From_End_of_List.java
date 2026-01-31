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
    public static int length(ListNode head){
        ListNode temp=head;
            int count=0;
         while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp=head;
    int ind=length(head)-n;
    if (ind==0){
        head=head.next;
        return head;
    }
    for(int i=0;i<ind;i++){
        if(i==ind-1){
            temp.next=temp.next.next;
            break;
        }
        temp=temp.next;
    }
    return head;
    }
}