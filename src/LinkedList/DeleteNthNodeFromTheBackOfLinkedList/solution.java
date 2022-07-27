package LinkedList.DeleteNthNodeFromTheBackOfLinkedList;

public class solution {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

        static Node head;

        public static Node deleteNthFromBack(Node head, int n){
            Node start = new Node(0);
            start.next = head;

            Node slow = start;
            Node fast = start;

            for(int i=0; i<n; i++){
                fast = fast.next;
            }

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;

            return start.next;
        }

        public static void printLL(Node head){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data+"->");
                curr = curr.next;
            }
            System.out.print("NULL");
        }

        public static void main(String[] args){
            head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            head.next.next.next.next.next = new Node(6);
            head.next.next.next.next.next.next = new Node(7);
            head.next.next.next.next.next.next.next = new Node(8);
            head.next.next.next.next.next.next.next.next = new Node(9);

            printLL(head);

            head = deleteNthFromBack(head, 6);
            System.out.println();

            printLL(head);

        }
    }
    
}
