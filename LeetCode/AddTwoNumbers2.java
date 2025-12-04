/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */

//time and space complexity is O(n)

public class AddTwoNumbers2 {

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode ptr = result;
            int carry = 0; // set default carry
            while (l1 != null || l2 != null) {
                int sum = 0 + carry;  // initialize sum
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if(l2 != null){
                    sum += l2.val;
                    l2 = l2.next;
                }
                // get sum and carry
                carry = sum / 10;
                sum = sum % 10;
                ptr.next = new ListNode(sum);
                ptr = ptr.next;
            }

            if(carry == 1) ptr.next = new ListNode(1);
            return result.next;
        }
    }



// to run in Intellij


    public static void main(String[] args) {
        // Build l1 = 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Build l2 = 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers2 outer = new AddTwoNumbers2();
        Solution solution = outer.new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}




