import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bst {

    public node root = null;

    public boolean searchnode(node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (data <= root.data) {
            return searchnode(root.left, data);
        } else {
            return searchnode(root.right, data);
        }
    }
        public void levelOrderTraversal()
    {
        Queue<node> ll = new LinkedList<>();
        ll.add(root);
        while(!ll.isEmpty())
        {
            node tempNode = ll.poll();
            System.out.println(tempNode.data);
            if(tempNode.left != null)
            {
                ll.add(tempNode.left);
            }
            if(tempNode.right != null)
            {
                ll.add(tempNode.right);
            }
        }
    }

    public node insertnode(node root, int data) {
        if (root == null) {
            return new node(data);
        } else if (data < root.data) {
            root.left = insertnode(root.left, data);
        } else {
            root.right = insertnode(root.right, data);
        }
        return root; // Return the updated root after insertion
    }

    public static void main(String[] args) {

        bst bst = new bst();
        bst.root = bst.insertnode(bst.root, 15);
        bst.root = bst.insertnode(bst.root, 10);
        bst.root = bst.insertnode(bst.root, 25);
        bst.root = bst.insertnode(bst.root, 20);
        bst.root = bst.insertnode(bst.root, 27);
        bst.root = bst.insertnode(bst.root, 11);
        bst.root = bst.insertnode(bst.root, 9);

        bst.levelOrderTraversal();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a searching number");
        int number = sc.nextInt();

        if (bst.searchnode(bst.root, number)) {
            System.out.println("Data is present in the tree");
        } else {
            System.out.println("Data is not present in the tree");
        }

    }
}
