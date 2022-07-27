package LinkedList.FindMiddleOfLinkedList;

public class solution {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void findMiddle(Node head){
        Node turt = head;
        Node hare = head;

        while(hare.next != null && hare != null){
            hare = hare.next.next;
            turt = turt.next;
        }

        System.out.println(turt.data);
    }

    public static void main(String[] args){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = null;

        findMiddle(head);

    }
}
