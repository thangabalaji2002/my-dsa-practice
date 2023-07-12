package dsa;

public class cirlinkedlist<T> {
	node last;
	class node{
		T data;
		node next;
		node(T val){
			data =val;
			next=null;
			}
		}
	cirlinkedlist(){
		last=null;
		
	}
	public void insertatbeg(T i) {
		
		node n =new node (i);
		if(last==null) {
			n.next=n;
			last=n;
			
			
		}
		else {
		n.next=last.next;
		last.next=n;
			}
		}
	public void insertatlst(T i) {
		
		node n =new node (i);
		if(last==null) {
			n.next=n;
			last=n;
			
			
		}
		else {
		n.next=last.next;
		last.next=n;
		last=n;
			}
		}
	
	public void display() {
		node temp=last.next;
		do {
			System.out.println(temp.data);
			temp=temp.next;
			
		}while(temp!=last.next);
		
		
	}
	public T delatbeg() {
		T temp=last.next.data;
		
		if (last ==null) {
			throw new ArrayIndexOutOfBoundsException("cant delete empty list");
		}
		if (last.next==last) {
			last=null;
			
		}
		else {
		last.next=last.next.next;
		}
	return temp;
	}
	public void delatlast() {
		if (last ==null) {
			throw new ArrayIndexOutOfBoundsException("cant delete empty list");
		}
		if (last.next==last) {
			last=null;
			
		}
		else {
			node temp=last.next;
			while(temp.next!=last) {
				temp=temp.next;
				
			}
			temp.next=last.next;
			last=temp;
			
			
			
		}
		
	}
	
	
}
