package dsa;

import java.util.Iterator;

public class linkedlist<T> implements Iterable<T>{
	node head;
	class node {
		T val;
		node next;
		
		node(T b){
			val=b;
			next=null;
		}
		
		}
	public void insertatbegin(T a) {
		node n=new node (a);
		if (head==null) {
			head=n;
			
		}
		else {
			n.next=head;
			head=n;
		}
		
		
		
	}
	public void traverse() {
		node temp=head;
		System.out.println("the values are ");
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
		
	}
	public void insertatpos(int p,T v) {
		if (p==0) {
			insertatbegin(v);
		}
		
		node n =new node(v);
		node temp =head;
		if (temp==null) {
			throw new IllegalArgumentException("invalid pos"+p);			
		}
	
		for (int i =0;i<p-1;i++) {
			temp=temp.next;
		}
		if (temp==null) {
			throw new IllegalArgumentException("invalid pos"+p);			
		}
		n.next=temp.next;
		temp.next=n;
		
		}
	public void delatpos(int pos) {
		if (head==null) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if(pos==0) {
			head=head.next;
		}
		
		node temp=head;
		node pre=null;
		for (int i=1;i<=pos;i++) {
			pre=temp;
			temp=temp.next;
			
		}
		pre.next=temp.next;
		
		
	}
	public void reverse() {
		node pre =null;
		node current =head;
		node next =current.next;
		while(current != null) {
			next=current.next;
			current.next=pre;
			pre=current;
			current=next;
		}
		head=pre;
		
		
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

