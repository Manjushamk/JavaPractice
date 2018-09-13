public class ReArrangingALinkedList {

    static Node head;  // head of list


    /* Node Class */
    static class Node {

        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }


    private void printlist(Node head) {
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    private void rearrange(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node current1 = head;
        Node current2 = slow.next;
        slow.next = null;

        while(current1 != null && current2!=null){
            Node temp = current1.next;
            Node temp2 = current2.next;
            current1.next = current2;
            current2.next = temp;
            current1 = temp;
            current2 = temp2;
        }

        printlist(head);
    }

    public static void main(String[] args) {

        ReArrangingALinkedList list = new ReArrangingALinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);

        //list.printlist(head); // print original list
        list.rearrange(head); // rearrange list as per ques
        System.out.println("");
        ///list.printlist(head); // print modified list

    }



}
