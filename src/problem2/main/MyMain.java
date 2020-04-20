import java.util.*;
import java.util.Queue;
import java.util.LinkedList;


public class MyMain
{
    public static void main(String[] args)
	{
        MyBinarySearchTree mytree = new MyBinarySearchTree();
        mytree.insert(20);
        mytree.insert(14);
        mytree.insert(56);
        mytree.insert(58);
        mytree.insert(67);
        mytree.insert(26);
        mytree.insert(85);
        mytree.insert(45);
        mytree.insert(13);
		    mytree.insert(24);
        mytree.insert(16);
        mytree.insert(78);
        mytree.insert(91);
        mytree.insert(77);
        mytree.insert(38);
        System.out.println("PreOrder Traversal : ");
        mytree.traversePreOrder();
        System.out.println("InOrder Traversal : ");
        mytree.traverseInOrder();
        System.out.println("PostOrder Traversal : ");
        mytree.traversePostOrder();
        System.out.println("Condition A : Root element is placed at opposite end," +"\n"+
                "i.e. in pre order root is the first element where as in post order root is the last element. is TRUE");
        System.out.println("Condition B :They have common mid point,\n"+
                "i.e. both the traversal will give same element at the mid position for odd number of nodes. is TRUE");
    }
}




public class TreeNode
{
	private int data;
	private TreeNode left;
	private TreeNode right;
		
	public TreeNode(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
    

  public int getData() 
	{
        return data;
    }

  public void setData(int data) 
	{
        this.data = data;
    }

  public TreeNode getLeft() 
	{
        return left;
    }

  public TreeNode getRight() 
	{
        return right;
    }

  public void setLeft(TreeNode left) 
	{
        this.left = left;
    }

  public void setRight(TreeNode right) 
	{
        this.right = right;
    }
}







public class MyBinarySearchTree
{
    private TreeNode root;

    public MyBinarySearchTree()
	{
        root=null;
    }

    public TreeNode getRoot() 
	{
        return root;
    }


    public void insert(int data)
	{
        root=insertRecursive(root,data);
    }

    TreeNode insertRecursive(TreeNode root,int data)
	{
        if(root==null)
		{
            root=new TreeNode(data);
            return root;
        }
        else
		{
            if(root.getData()>data)
			{
                root.setLeft(insertRecursive(root.getLeft(),data));
            }
            else if(root.getData()<data)
			{
                root.setRight(insertRecursive(root.getRight(),data));
            }
            return root;
        }
    }


    public void traverseInOrder()  
	{
        traverseInOrderRec(root);
        System.out.println();
    }

 
    void traverseInOrderRec(TreeNode root) 
	{
        if (root != null) 
		{
            traverseInOrderRec(root.getLeft());
            System.out.print(root.getData()+" ");
            traverseInOrderRec(root.getRight());
        }
    }

 
    public int traverseLeft()  
	{
        int noOfNodesNotHavingLeftChild = traverseLeftNodesRec(root, false);
        System.out.println();
        return noOfNodesNotHavingLeftChild;
    }

 
    int traverseLeftNodesRec(TreeNode root,boolean fromLeft) 
	{
        int count=0;
        if (root != null) 
		{
            if(fromLeft==true)
			{
                System.out.print(root.getData()+" ");
			}
            if(root.getLeft()==null)
			{
                count++;
            }
            return count=count+traverseLeftNodesRec(root.getLeft(),true) + traverseLeftNodesRec(root.getRight(),false);
        }
        return count;
    }

    public void traversePreOrder()  
	{
        traversePreOrderRec(root);
        System.out.println();
    }

   
    void traversePreOrderRec(TreeNode root) 
	{
        if (root != null) 
		{
            System.out.print(root.getData()+" ");
            traversePreOrderRec(root.getLeft());
            traversePreOrderRec(root.getRight());
        }
    }

    public void traversePostOrder()  
	{
        traversePostOrderRec(root);
        System.out.println();
    }

 
    void traversePostOrderRec(TreeNode root) 
	{
        if (root != null) 
		{
            traversePostOrderRec(root.getLeft());
            traversePostOrderRec(root.getRight());
            System.out.print(root.getData()+" ");
        }
    }

    public boolean search(int data)
	{
        TreeNode node=searchRec(root,data);
        if(node==null)
		{
            return false;
        }
        else if(node.getData()==data)
		{
            return true;
        }
        else 
		{
            return false;
        }
    }
    public TreeNode searchRec(TreeNode root, int data)
    {
    
        if (root==null || root.getData()==data)
		{
            return root;
		}
        
        if (root.getData() > data)
		{
            return searchRec(root.getLeft(), data);
		}
    
        return searchRec(root.getRight(), data);
    }

    public int count()
	{
        return countRec(root);
    }

    
    public int countRec(TreeNode root) 
{
        if (root == null)
		{
            return 0;
		}
        int count = 0;
        count++;
        count += (countRec(root.getLeft()) + countRec(root.getRight()));
        return count;
    }
  
}
