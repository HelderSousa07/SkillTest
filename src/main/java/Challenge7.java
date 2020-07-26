class Challenge7 {

/*    7. Linked List Intersection:
    If two requests on the queue have linked lists that intersect (like the example below),
    previous service could be improved to process only the difference between them.
    Write a method that receives two singly linked lists and return the intersecting node
    of the two lists (if exists). Note that the intersection is defined by reference, not value.
            (No need to change previous answer).*/

    public static void main(String[] args)
    {
        MLinkedList linkedList = new MLinkedList();

        MLinkedList.head1 = new MLinkedList.Node(3);
        MLinkedList.head1.next = new MLinkedList.Node(1);
        MLinkedList.head1.next.next = new MLinkedList.Node(5);
        MLinkedList.head1.next.next.next = new MLinkedList.Node(8);
        MLinkedList.head1.next.next.next.next = new MLinkedList.Node(10);
        MLinkedList.head1.next.next.next.next.next = new MLinkedList.Node(2);
        MLinkedList.head1.next.next.next.next.next.next = new MLinkedList.Node(1);

        MLinkedList.head2 = new MLinkedList.Node(4);
        MLinkedList.head2.next = new MLinkedList.Node(6);
        MLinkedList.head2.next.next = new MLinkedList.Node(10);
        MLinkedList.head2.next.next.next = new MLinkedList.Node(2);
        MLinkedList.head2.next.next.next.next = new MLinkedList.Node(1);

        System.out.println("Intersection: " + linkedList.getNode());
    }
} 