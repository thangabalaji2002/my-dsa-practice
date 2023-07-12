package dsa;

public class queuelistmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queuelist a =new queuelist();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		System.out.println("the dequeued element is "+a.dequeue() );  
		System.out.println("the dequeued element is "+a.dequeue() );  
		System.out.println("the dequeued element is "+a.dequeue() );  
		System.out.println("the dequeued element is "+a.dequeue() );  
		System.out.println("the dequeued element is "+a.dequeue() );  
	}

}
