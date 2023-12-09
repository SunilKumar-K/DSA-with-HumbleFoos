import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class node{
        int data;
        node left;
        node right;

        public node (int data)
        {
            this.data = data;
            left = right = null;
        }
    }

public class tree{

    public static void inorder(node node)
    {
        
        if(node == null)
        {
            return ;
        }
        inorder(node.left);
        System.out.print(node.data);
        inorder(node.right);
    }
    public static void preorder(node node)
    {
        if(node == null)
        {
            return ;
        }
        System.out.print(node.data);
        preorder(node.left);
        preorder(node.right);

    }

    public static void postorder(node node)
    {
        if(node == null)
        {
            return ;
        }
        postorder(node.right);
        postorder(node.left);
        System.out.print(node.data);
    }

    public void inorderTraversal()
    {
        if(root == null)
        {
            return ;
        }
        Stack<node> stack = new Stack<>();

        node curr = root;
        while(curr != null || stack.size()>0)
        {
            while(curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data);
            curr = curr.right;
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
    public node root = null;

    public static void main(String[] args) {

        
        tree tr = new tree();
        tr.root = new node(10);
        tr.root.left =  new node(15);
        tr.root.right = new node(20);
        tr.root.left.left = new node(25);
        tr.root.left.right = new node(30);
        tr.root.right.left = new node(35);
        tr.root.right.right = new node(40);
        

        inorder(tr.root);
        System.out.println();
        postorder(tr.root);
        System.out.println();
        preorder(tr.root);

        System.out.println();

        tr.levelOrderTraversal();

        tr.inorderTraversal();

        

    }
}