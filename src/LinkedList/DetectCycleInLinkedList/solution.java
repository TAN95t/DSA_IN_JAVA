package LinkedList.DetectCycleInLinkedList;

public class solution {


    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }


    static Node head;

    // function to detect linked list cycle
    public static boolean detectCycle(Node head){
        Node turt = head;
        Node hare = head;

        while(hare.next != null  && hare.next.next != null){
            hare = hare.next.next;
            turt = turt.next;

            if(hare == turt){
                return true;
            }
        }
        return false;
    }
    
    // utility function to create cycle in a linked list
    public static void createCycle(Node head, int a, int b){
        int counta = 0, countb = 0;
        Node p1 = head; Node p2 = head;
        while(counta != a || countb != b){
            if(counta != a){
                counta++;
                p1=p1.next;
            }
            if(countb != b){
                countb++;
                p2 = p2.next;
            }
        }
        p2.next = p1;
    }

    public static void main(String[] args){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next = head;


        System.out.println(detectCycle(head));
    }    
}
