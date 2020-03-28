import java.util.*;


class Node
{
    private int data;
    private Node next;

    public Node(int data) 
	{
        this.data = data;
        next = null;
    }

    public int getData() 
	{
        return data;
    }

    public void setData(int data) 
	{
        this.data = data;
    }

    public Node getNext() 
	{
        return next;
    }

    public void setNext(Node next) 
	{
        this.next = next;
    }
}









public class MyQueue
{
    private Node rear;
    private Node front;
    private int size;


    public MyQueue() 
	{
        front = null;
        rear = null;
        size = 0;
    }

    public void storePreOrderSuccessor(MyBinarySearchTree tree)
	{
        TreeNode root=tree.getRoot();
        storePreOrderSuccesssorRec(root);
    }

    void storePreOrderSuccesssorRec(TreeNode root) 
	{
        if (root != null) 
		{
            enqueue(root.getData());
            storePreOrderSuccesssorRec(root.getLeft());
            storePreOrderSuccesssorRec(root.getRight());
        }
    }


    public boolean isEmpty() 
	{
        boolean response = false;
        if (size == 0) 
		{
            response = true;
        }
        return response;
    }


    public void enqueue(int element) 
	{
        Node node = new Node(element);
        if (isEmpty()) 
		{
            rear = node;
            front = node;
            size++;
        } 
		else 
		{
            rear.setNext(node);
            rear = node;
            size++;
        }
    }



    public Node dequeue()
	{
        Node res = null;
        if(!isEmpty()) 
		{
            if(front.getNext()!=null) 
			{
                res = front;
                front = front.getNext();
                res.setNext(null);
                size--;
            }
            else 
			{
                res=front;
                front=null;
                rear=null;
                size--;
            }
        }
        else 
		{
            System.out.println("Queue UnderFlow");
        }
        return res;

    }

    public Node peek() 
	{
        Node response = null;
        if (!isEmpty()) 
		{
            response = new Node(front.getData());
        }
        return response;
    }


    public void display()
	{
        System.out.print("Display Queue: ");
        Node temp=front;
        while(temp!=null)
		{
            System.out.print(temp.getData());
            if(temp.getNext()!=null)
			{
                System.out.print("--------");
            }
            temp=temp.getNext();
        }
        System.out.println();
    }

    public int getSize() 
	{
        return size;
    }

    public Node rear()
	{
        return rear;
    }
}
