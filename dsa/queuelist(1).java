package dsa;

public class queuelist {
	class node{
		int data;
		node next;
		node (int val){
			data=val;
		}
		
	}		
	node front,rear;
	queuelist(){
		front=null;
		rear=null;
	}
	public void enqueue(int d) {
		node n =new node (d);
		if (front==null) {
			front=n;
			rear=n;
			return;
		}
		rear.next=n;
		rear=n;
		
	}
	public int dequeue() {
		if(front==null) {
			throw new ArrayIndexOutOfBoundsException("array empty");
		}
		int get =front.data;
		front=front.next;
		if(front==null)
			rear=null;
		return get;
	}
	
	
}
