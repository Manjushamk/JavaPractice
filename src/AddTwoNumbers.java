class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = null;
        ListNode currentNode = resultNode;
        int sum,x,y;
        int nextDigit = 0;
        ListNode myNode1 = l1;
        ListNode myNode2 = l2;
        while(myNode1 != null || myNode2 != null || nextDigit != 0){
            if (myNode1 != null)
                x = myNode1.val;
            else
                x = 0;
            if (myNode2 != null)
                y = myNode2.val;
            else
                y = 0;

            sum = x + y + nextDigit;
            nextDigit = sum/10;
            if(currentNode == null ){
                resultNode = new ListNode(sum % 10);
                resultNode.next = null;
                currentNode = resultNode;
            }
            else{
                ListNode tempNode = new ListNode(sum % 10);
                currentNode.next = tempNode;
                currentNode = tempNode;
            }
            if(myNode1 != null) myNode1 = myNode1.next;
            if (myNode2 != null) myNode2 = myNode2.next;
        }

        return resultNode;
    }
}