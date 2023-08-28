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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode temp = null;
        int sum;
        int carry = 0;
        while(l1!= null || l2!= null)
        {
            sum =carry;
            if (l1 !=null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 !=null)
            {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode node = new ListNode(sum % 10);
            carry = Math.floorDiv(sum,10);

            if(temp == null)
            {
                l3 =  node;
                temp = node;
            }
            else
            {
                temp.next = node;
                temp = temp.next;
            }
        }
        if(carry == 1)
        {
            temp.next = new ListNode(carry);
        }
        return l3;   
    }
}