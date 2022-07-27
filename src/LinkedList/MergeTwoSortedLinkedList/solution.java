package LinkedList.MergeTwoSortedLinkedList;

public class solution {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

        static Node h1;
        static Node h2;

        // function to merge to linked list using space
        public static Node merge(Node h1, Node h2){
            Node dummey = new Node(0);
            Node dd = dummey;

            Node p = h1;
            Node q = h2;

            while(p != null && q != null){
                Node temp = new Node(-1);
                if(p.data > q.data){
                    temp.data = q.data;
                    dd.next = temp;
                    q = q.next;
                    dd = dd.next;
                }
                else{
                    temp.data = p.data;
                    dd.next = temp;
                    p = p.next;
                    dd = dd.next;
                }
            }

            if(p != null){
                
                while(p != null){
                    Node temp = new Node(-1);
                    temp.data = p.data;
                    p=p.next;
                    dd.next = temp;
                    dd = dd.next;
                }
            }
            else{
                while(q != null){
                    Node temp = new Node(-1);
                    temp.data = q.data;
                    q = q.next;
                    dd.next = temp;
                    dd = dd.next;
                }
            }

            dd.next = null;
            return dummey.next;

        }


        // utility function to print the linked list
        public static void printLL(Node head){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
            System.out.print("null");

        }

        public static Node mergeOptimal(Node h1, Node h2){
            Node l1 = h1;
            Node l2 = h2;
            if(l1.data > l2.data){
                Node temp = l1;
                l1 = l2;
                l2 = temp;
            }

            Node res = l1;
            while(l1 != null &&  l2 != null){
                Node temp = null;
                while(l1 != null && l1.data <= l2.data ){
                    temp = l1;
                    l1 = l1.next;
                }
                // when l1 > l2
                // break the link
                temp.next = l2;

                // swap l1 & l2
                Node tmp = l1;
                l1 = l2;
                l2 = tmp;
            }

            return res;
        }


        public static void main(String[] args){
            h1 = new Node(5);
            h1.next = new Node(7);
            h1.next.next = new Node(9);



            h2 = new Node(3);
            h2.next = new Node(4);
            h2.next.next = new Node(8);
            h2.next.next.next = new Node(10);

            // Node ans = merge(h1, h2);

            // printLL(ans);

            Node newAns = mergeOptimal(h1, h2);

            printLL(newAns);

        }
    }


}
