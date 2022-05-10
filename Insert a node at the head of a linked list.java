//https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem





    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode temp=new SinglyLinkedListNode(data);
        SinglyLinkedListNode res=temp;
        res.next=llist;
        return temp;
    }
