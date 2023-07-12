package dsa;

public class queuemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue2<Integer> q =new queue2<Integer>();
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(9);
		q.enqueue(1);
		q.enqueue(0);
		System.out.println("the dequeued element is "+q.dequeue());
		System.out.println("the dequeued element is "+q.dequeue());
		System.out.println("the dequeued element is "+q.dequeue());
		System.out.println("the dequeued element is "+q.dequeue());
		System.out.println("the dequeued element is "+q.dequeue());
	
		
	}

}
