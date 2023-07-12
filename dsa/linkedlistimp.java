package dsa;

import java.util.Iterator;

public class linkedlistimp {

	public static void main(String[] args) {
		linkedlist <Integer>obj =new linkedlist<Integer>();
		obj.insertatbegin(5);
		obj.insertatbegin(3);
		obj.insertatbegin(1);
		obj.traverse();
		obj.insertatpos(1,9);
		
		obj.traverse();
		obj.delatpos(1);
		obj.reverse();
		
		for (int a:obj) {
			 System.out.println(a+" ");
		 }
		Iterator<Integer> it=obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
