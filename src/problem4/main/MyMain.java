import java.util.*;

public class MyMain
{
    public static void main(String[] args)
	{
        MyBinarySearchTree mytree=new MyBinarySearchTree();
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
        MyQueue queue = new MyQueue();
        queue.storePreOrderSuccessor(mytree);
        queue.display();
    }
}
