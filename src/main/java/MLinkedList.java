
public class MLinkedList {

    static MLinkedList.Node head1, head2;

    static class Node {

        int data;
        MLinkedList.Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    int getNode()
    {
        int current1 = getCount(head1);
        int current2 = getCount(head2);
        int d;

        if (current1 > current2) {
            d = current1 - current2;
            return getIntesectionNode(d, head1, head2);
        }
        else {
            d = current2 - current1;
            return getIntesectionNode(d, head2, head1);
        }
    }


    int getIntesectionNode(int d, MLinkedList.Node node1, MLinkedList.Node node2)
    {
        int i;
        MLinkedList.Node current1 = node1;
        MLinkedList.Node current2 = node2;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return -1;
    }

    int getCount(MLinkedList.Node node)
    {
        MLinkedList.Node current = node;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

}
