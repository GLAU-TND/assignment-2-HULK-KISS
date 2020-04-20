import java.util.*;


public class MyMain
{
    public static void main(String[] args)
	{
        Random rand = new Random();
        MyCircularQueue queue = new MyCircularQueue();
        System.out.println("Adding Students :\n-------------------------------------------------------------------------");
        queue.enqueue(new Student(1,"Nitish",2,rand.nextInt(2)+1));
		    queue.display();
        queue.enqueue(new Student(2,"Vikas",4,rand.nextInt(2)+1));
		    queue.display();
        queue.enqueue(new Student(3,"Ranjan",3,rand.nextInt(2)+1));
		    queue.display();
        queue.enqueue(new Student(4,"Vishal",5,rand.nextInt(2)+1));
		    queue.display();
        queue.enqueue(new Student(5,"Alok",0,rand.nextInt(2)+1));
		    queue.display();
        System.out.println("Processing Elements :\n-----------------------------------------------------------------------");
        while (queue.processStudents()!=false)
		{
			
        }
        queue.display();
    }
}
