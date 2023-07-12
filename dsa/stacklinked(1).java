package dsa;

public class stacklinked <T>{
		class node{
			T data;
			node next;
			node (T val){
				data=val;
				next=null;
			}
			
		} 
		node top;
		stacklinked(){
			top=null;
		}
		public void push(T a) {
			node n =new node (a);
			if (top==null) {
			
				top=n;
			}
			else {
				n.next=top;
				top=n;
			}
			
		}
		public T pop() {
			if (top ==null)
				throw new ArrayIndexOutOfBoundsException("stack empty");
			T temp =top.data;
			top=top.next;
			return temp;
		}
		boolean isempty() {
			return top==null;
		}
		public T seek() {
			if (top ==null)
				throw new ArrayIndexOutOfBoundsException("stack empty");
			T temp =top.data;
		
			return temp;
		}
		public void display() {
			node temp =top;
			System.out.println("the values are");
			while(temp!=null) {
			
				System.out.println(temp.data);
				temp=temp.next;
			}
		}

		}
	