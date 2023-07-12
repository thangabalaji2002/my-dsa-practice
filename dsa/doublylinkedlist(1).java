package dsa;

import java.util.Iterator;

public class doublylinkedlist<T> implements Iterable<T>{
	node head;
	node tail;
	class node {
		T val;
		node next;
		node pre;
		
		node(T b){
			val=b;
			next=null;
			pre =null;
		}
		
		}
	public doublylinkedlist(){
		 head=null;
		 tail=null;
	}
	public void insertatbegin(T a) {
		node n=new node (a);
		if (head==null) {
			head=n;
			tail=n;
			
			
		}
		else {
			n.next=head;
			head.pre=n;
			head=n;
		}
		
		
		
	}
	public void traverse() {
		node temp=head;
		System.out.println("the values are ");
		if (temp==null) {
			System.out.print("no elements");
		}
		while(temp!=null) {
			
			System.out.println(temp.val);
			temp=temp.next;
		}
		
	}
	public void traverserev() {
		node temp=tail;
		System.out.println("the values are ");
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.pre;
		}
		
	}
	public void insertatpos(int p,T v)  {
		if (p==0) {
			insertatbegin(v);
			return;
		}
		
		node n =new node(v);
		node temp =head;
	
	
		for (int i =1;i<p;i++) {
			temp=temp.next;
			if (temp==null) {
				throw new IllegalArgumentException("invalid pos"+p);
				
			}
		}
	
		n.next=temp.next;
		n.pre=temp;
		if (temp==tail) {
			tail=n;
			temp.next=n;
		}

		
		else {
		temp.next.pre=n;
		temp.next=n;}

		
		}
	public void delatpos(int pos) {
		if (head==null) {
			throw new ArrayIndexOutOfBoundsException();
		}
	
		if(pos==0) {
			head=head.next;
			if (head==null) {
			
				tail=null;
				return;
			}
			else {
		
			head.pre=null;
			return;}
			
		}
		
		node temp=head;
		node pre=null;
		for (int i=1;i<=pos;i++) {
			pre=temp;
			temp=temp.next;
			if (temp==null) {
				throw new IndexOutOfBoundsException("invalid pos");
			}
			
		}
		pre.next=temp.next;
		if(temp.next==null) {
			pre=tail;
		}
		if (temp.next!=null) {
		temp.next.pre=pre;}
		
		
		
	}

	
	
	
	
	
	 public Iterator<T> iterator(){
		
		 return new Iterator<T>(){
			 node temp=head;
			 public boolean hasNext() {
				 return temp!=null;
				 
			 }
			 public T next() {
				
				 T val=temp.val;
				 temp=temp.next;
				 return val;
			 }
			 
		 };
		 
	 }
	
	

}