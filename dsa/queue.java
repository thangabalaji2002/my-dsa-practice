package dsa;

public class queue<T> {
		int max=30;
		@SuppressWarnings("unchecked")
		T arr[]=(T[]) new Object[max];
		int front;
		int rear;
		queue() {
			front=-1;
			rear=-1;
		}
		public void enqueue(T val) {
			if(rear<max-1)
			arr[++rear]=val;
			if(front==-1)
				front++;
			
		}
		public T dequeue() {
			if(front==-1||front>rear) {
				throw new ArrayIndexOutOfBoundsException("array empty");
			}
			return arr[front++];
			
		}
		
	
}
