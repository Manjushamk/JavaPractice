public class kthElementInList {
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

    private int getKthElement(Node head, int k) {
        Node slow = head;
        Node fast = head;
        int i = 0;
        while(i < k){
            if(fast == null){
                return -1;
            }
            i++;
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }

    private static boolean deleteMiddle(Node n){
        if(n == null || n.next == null){
            return false;
        }
        n.data = n.next.data;
        n.next = n.next.next;
        return true;
    }


    public static void main(String[] args) {
        kthElementInList list = new kthElementInList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        int k = 3;
        Node mid = list.head.next.next.next;
        System.out.println(list.getKthElement(head, k));
        System.out.println(deleteMiddle(mid));
        list.printlist(head);
    }

}

