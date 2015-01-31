package dudu.pp.chapter13;

import com.google.common.primitives.Ints;

/**
 * Created by jadetang on 15-1-31.
 */
public class InSetImpWithLinkedList extends IntSet {

    private Node head;
    private int maxElement;
    private int size;


    public InSetImpWithLinkedList(int size, int max) {
        super(size, max);
        head = new Node(max);
        maxElement = max;
        //   sentinel = head;
    }

    @Override
    public void insert(int t) {
        head = insert(head, t);
    }

    private Node insert(Node x, int t) {
        int cmp = Ints.compare(t, x.value);
        if (cmp < 0) {
            Node temp = new Node(t);
            temp.next = x;
            size++;
            return temp;
        } else if (cmp > 0) {
            x.next = insert(x.next, t);
            return x;
        }
        return x;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int[] report() {
        int[] result = new int[size];
        Node tempNode = head;
        int index = 0;
        while (tempNode.value != maxElement) {
            result[index++] = tempNode.value;
            tempNode = tempNode.next;
        }
        return result;
    }


    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;
        }
    }

}
