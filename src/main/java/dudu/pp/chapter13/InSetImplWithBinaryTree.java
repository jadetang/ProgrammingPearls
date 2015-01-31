package dudu.pp.chapter13;

import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import java.util.List;

/**
 * Created by jadetang on 15-1-31.
 */
public class InSetImplWithBinaryTree extends IntSet {

    private int size;

    private Node root;

    private int max;

    public InSetImplWithBinaryTree(int size, int max) {
        super(size, max);
        size = 0;
        root = new Node(max);
        this.max = max;
    }


    @Override
    public void insert(int t) {
        root = insert(root, t);
    }

    private Node insert(Node x, int t) {
        if (x == null) {
            Node newNode = new Node(t);
            size += 1;
            return newNode;
        }
        int cmp = Ints.compare(t,x.value);
        if(cmp < 0 ){
            x.left = insert(x.left,t);
        }else if(cmp>0){
            x.right = insert(x.right,t);
        }
        return x;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int[] report() {
        List result = Lists.newLinkedList();
        travese(root.left,result);
        int[] result2 =  Ints.toArray(result);
        return result2;

    }

    private void travese(Node x, List result) {
        if(x == null ){
            return;
        }
        travese(x.left,result);
        result.add(x.value);
        travese(x.right,result);
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
