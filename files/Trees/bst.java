import java.util.Scanner;

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
public class bst {

    public node root  = null;

    public boolean searchnode(node root , int data)
    {
        if(root == null )
        {
            return false;
        }
        else if(root.data == data )
        {
            return true;
        }
        else if(data <= root.data)
        {
           return searchnode(root.left,data);
        }
        else {
            return searchnode(root.right,data);
        }
    }

    public void insertnode(node root,int data)
    {
        node newnode = new node(data);

        if(root == null)
        {
            root = newnode;
            return ;
        }
        else if(data < root.data )
        {
            insertnode(root.left, data);
        }
        else{
            insertnode(root.right, data);
        }
    }
    public static void main(String[] args) {

        bst bst = new bst();
        bst.insertnode(bst.root ,15);
        bst.insertnode(bst.root,10);
        bst.insertnode(bst.root,25);
        bst.insertnode(bst.root, 9);
        bst.insertnode(bst.root,11);
        bst.insertnode(bst.root,20);
        bst.insertnode(bst.root,27);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a searching number");
        int number = sc.nextInt();

        if(bst.searchnode(bst.root,number))
        {
            System.out.println("data is present in the  tree");
        }
        else {
            System.out.println("data is not present in the tree");
        }
         
    }
}

