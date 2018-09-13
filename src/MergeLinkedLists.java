public class MergeLinkedLists {

    node head = null;
    // node a,b;
    static class node
    {
        int val;
        node next;

        public node(int val)
        {
            this.val = val;
        }
    }

    void push(int new_data)
    {
        /* allocate node */
        node new_node = new node(new_data);

        /* link the old list off the new node */
        new_node.next = head;

        /* move the head to point to the new node */
        head = new_node;
    }

    void printList(node headref)
    {
        while (headref != null)
        {
            System.out.print(headref.val + " ");
            headref = headref.next;
        }
    }

    node getMiddleNode(node head){
        if(head == null){
            return null;
        }else{
            node s = head;
            node f = head.next;
            while(f != null){
                f = f.next;
                if(f != null){
                    s = s.next;
                    f = f.next;
                }
            }
            return s;
        }
    }

    private node mergeSort(node head) {
        if(head == null || head.next == null){
            return head;
        }
        else {
            node middle = getMiddleNode(head);
            node nextOfMiddle = middle.next;
            middle.next = null;

            node left = mergeSort(head);
            node right = mergeSort(nextOfMiddle);

            return merge(left,right);
        }
    }

    private node merge(node left, node right) {
        node result = null;
        if(left == null)
            return right;
        if(right == null)
            return left;

        if(left.val < right.val){
            result = left;
            left.next = merge(left.next, right);
        }else{
            result = right;
            right.next = merge(left, right.next);
        }

        return result;
    }


    public static void main(String[] args) {
        MergeLinkedLists li = new MergeLinkedLists();

        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);
        System.out.println("Linked List without sorting is :");
        li.printList(li.head);

        // Apply merge Sort
        li.head = li.mergeSort(li.head);
        System.out.print("\n Sorted Linked List is: \n");
        li.printList(li.head);
    }


}
