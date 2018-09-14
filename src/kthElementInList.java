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

    private static Node partition(Node head, int k) {
        Node list1 = null;
        Node temp1 = null;
        Node temp2 = null;
        Node list2 = null;
        Node next = null;
        Node current = head;
        while(current != null){
            if(current.data < k){
                next = current.next;
                current.next = null;
                if(list1 == null){
                    list1 = current;
                    temp1 = list1;
                }
                temp1.next = current;
                temp1 = temp1.next;
                current = next;
            }else{
                next = current.next;
                current.next = null;
                if(list2 == null){
                    list2 = current;
                    temp2 = list1;
                }
                temp2.next = current;
                temp2 = temp2.next;
                current = next;
            }
        }
        temp1.next = list2;
        temp2.next = null;
        return list1;
    }


    public static void main(String[] args) {
        kthElementInList list = new kthElementInList();
        list.head = new Node(3);
        list.head.next = new Node(5);
        list.head.next.next = new Node(8);
        list.head.next.next.next = new Node(5);
        list.head.next.next.next.next = new Node(10);
        list.head.next.next.next.next.next = new Node(2);
        int k = 3;
        Node mid = list.head.next.next.next;
        System.out.println(list.getKthElement(head, k));
        System.out.println();
        list.printlist(partition(head,5));

        System.out.println(deleteMiddle(mid));
        list.printlist(head);
    }


}

