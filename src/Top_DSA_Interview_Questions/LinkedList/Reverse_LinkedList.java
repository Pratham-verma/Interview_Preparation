//package Top_DSA_Interview_Questions.LinkedList;

//public class Reverse_LinkedList {
//    public static Node reverse(Node head){
//        Node prev = null;
//        Node curr = head;
//
//        while (curr != null){
//            Node temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        return prev;
//    }
//    public static void print(Node head){
//        Node current = head;
//        while (current != null){
//            System.out.print(current.val);
//            current = current.next;
//        }
//        System.out.print("null");
//    }
//    public static void main(String[] args){
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next = new Node(3);
//        head.next = new Node(4);
//        head.next = new Node(5);
//
//        System.out.println("the Original is : " + head);
//        print(head);
//
//        reverse(head);
//        System.out.println("the Reverse is : " + head);
//
//    }
//
//}
