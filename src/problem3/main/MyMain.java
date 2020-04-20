import java.util.*;

public class MyMain
{
    public static void main(String[] args)
	{
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student(11,"Hulk"));
        queue.display();
        queue.enqueue(new Student(2,"Spider Man"));
        queue.display();
        queue.enqueue(new Student(8,"Thor"));
        queue.display();
        queue.enqueue(new Student(5,"Captian America"));
        queue.display();
        queue.enqueue(new Student(9,"Iron Man"));
        queue.display();
        queue.enqueue(new Student(6,"Dr. Strange"));
        queue.display();
        queue.enqueue(new Student(7,"Venom"));
        queue.display();
        queue.enqueue(new Student(12,"Thanos"));
        queue.display();
        queue.enqueue(new Student(4,"Black Panther"));
        queue.display();
        queue.enqueue(new Student(1,"Nick Furey"));
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
		queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
		queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
		queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
		queue.display();
        System.out.println("The Size Queue is = " + queue.getSize());

    }
}
