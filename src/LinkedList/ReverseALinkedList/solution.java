package LinkedList.ReverseALinkedList;


public class solution {

    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node addAtfirst(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }


    public static Node addAtLast(Node head, int data){
        Node newNode = new Node(data);

        Node p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = newNode;
        newNode.next = null;

        return head;
    }

    public static Node reverseLL(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            // update 
            prev = curr;
            curr = next;
        }
        head = prev;

        return head;
    }


    public static Node addInMiddle(Node head, int data){
        Node newNode = new Node(100);
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node Next = slow.next;
        slow.next = newNode;
        newNode.next = Next;
        return head;
    }

    public static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(slow != null && fast != null && fast.next != null){
            if(fast == slow){
                return true;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return false;
    }

    public static void findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        System.out.println(slow.data);
    }

    // utility function to reverse a linked list
    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    

    public static void main(String[] args){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printList(head);
        head = addAtfirst(head, 8);
        head =addAtLast(head, 10);
        findMiddle(head);
        head = addInMiddle(head, 22);
        System.out.println();
        head = reverseLL(head);
        System.out.println();
        printList(head);



    }
}
