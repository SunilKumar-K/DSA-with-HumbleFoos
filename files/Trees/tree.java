
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

    public node root = null;

    public static void main(String[] args) {

        
        tree tr = new tree();
        tr.root = new node(10);
        tr.root.left =  new node(15);
        tr.root.right = new node(20);
        

        inorder(tr.root);
        System.out.println();
        postorder(tr.root);
        System.out.println();
        preorder(tr.root);
        

    }
}