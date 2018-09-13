public class RemoveDuplicateFromLinkedList {
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

    private void deleteDup(Node head) {
        Node current = head;
        while(current != null){
            Node inner = current;
            while(inner.next != null){
                if(current.data == inner.next.data){
                    inner.next = inner.next.next;
                    inner = inner.next;
                }else{
                    inner = inner.next;
                }
            }
            current = current.next;
        }
    }



    public static void main(String[] args) {
        RemoveDuplicateFromLinkedList list = new RemoveDuplicateFromLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(3);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);

        list.deleteDup(head); // rearrange list as per ques
        list.printlist(head); // print modified list
    }

}
