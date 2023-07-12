package dsa;

public class stack<T> {
	public static int maxlength=30;
	@SuppressWarnings("unchecked")
	T arr[]= (T[])new Object[maxlength];
	int top;
	
	stack() {
		top=-1;
	}
	
	public void push(T val) {
		if(top==maxlength-1)
			throw new ArrayIndexOutOfBoundsException("Array overflow");
		arr[++top]= val;
	}
	public T pop() {
		if (top==-1)
			throw new ArrayIndexOutOfBoundsException("Array underflow");
		return arr[top--];
	}
	public void peek() {
		System.out.println(arr[top]);
	}
	public void  display() {
		for (int i =0;i<=top;i++) {
			System.out.println("the value of "+i+" position is "+arr[i]);
		}
	}
}
