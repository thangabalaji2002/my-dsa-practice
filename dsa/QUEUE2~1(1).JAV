package dsa;

public class queue2<T> {
	int max=30;
	@SuppressWarnings("unchecked")
	T arr[]=(T[]) new Object[max];
	
	int rear;
	queue2() {
	
		rear=-1;
	}
	public void enqueue(T val) {
		if(rear<max-1)
		arr[++rear]=val;
		
		
	}
	public T dequeue() {
		if(rear==-1) {
			throw new ArrayIndexOutOfBoundsException("array empty");
		}
		
		T temp=arr[0];
		for(int i=1;i<=rear;i++) {
			arr[i-1]=arr[i];
		}
		rear--;
		
		
		
		return temp;
		
	}}