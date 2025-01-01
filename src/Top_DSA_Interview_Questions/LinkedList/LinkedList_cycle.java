package Top_DSA_Interview_Questions.LinkedList;
import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
        this.next = null;
    }
}
public class LinkedList_cycle {
        public boolean hasCycle(ListNode head) {
            ListNode rabbit = head;
            ListNode turtle = head;

            while (rabbit != null && rabbit.next != null){
                rabbit = rabbit.next.next;
                turtle = turtle.next;

                if (rabbit == turtle) return true;
            }
            return false;
        }
}
