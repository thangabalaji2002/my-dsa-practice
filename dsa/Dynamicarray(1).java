package dsa;

import java.util.Scanner;

public class Dynamicarray {
		private static final int initial_capacity=16;
		private int arr[];
		private int size;
		private int capacity;
		
		
		Dynamicarray(){
			arr=new int[initial_capacity];
			size=0;
			capacity=initial_capacity;
			
			}
		public void insert(int a) {
			if (size==capacity) {
				expand();
				
			}
			
			arr[size++]=a;
		
			
			
		}
		private void expand() {
			
			capacity *=2;
			arr=java.util.Arrays.copyOf(arr, capacity);
		
			}
		private void shrinkcapacity() {
			capacity=capacity/2;
			arr= java.util.Arrays.copyOf(arr, capacity);
			
		}
		public void display() {
			System.out.println("The elements are :");
			for (int i =0;i<size;i++) {
				System.out.println(arr[i]+" ");
			}
			
			
		}
		public void insertatpos(int p,int v) {
			if (size==capacity) {
				expand();
				}
			
			for(int i =size-1;i>=p;i--) {
				arr[i+1]=arr[i];
				}
			arr[p]=v;
			size++;
		}
		public void deleteAtpos(int d) {
			
			
			for (int i =(d+1);i<size;i++) {
				arr[i-1]=arr[i];
			}
			size--;
			if (capacity>initial_capacity&& capacity>3*size) {
				shrinkcapacity();
			}
			
			
		}
		public void deleteAtend() {
			deleteAtpos(size-1);
		}
		
		
		
		
	
	
	

	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Dynamicarray lst=new Dynamicarray();
		while (true) {
			int choice,val,ins,pos,del;
			System.out.println("\n-------LIST MENU--------- ");
			System.out.println("1.insert at end of list");
			System.out.println("2.display the list");
			System.out.println("3.insert at specified position of list");
			System.out.println("4.delete at specified position");
			System.out.println("5.Exit \n");
			System.out.println("6.delete at end position");
			System.out.println("\n-------------------------");
			System.out.println("enter your choice ");
			Scanner input = new Scanner(System.in);
			choice =input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter the value to insert ");
				val=input.nextInt();
				lst.insert(val);
				break;
			case 2:
				lst.display();
				break;
			case 3:
				System.out.println("enter the value to insert ");
				 ins=input.nextInt();
				System.out.println("enter the position to insert ");
				pos=input.nextInt();
				lst.insertatpos(pos,ins);
				break;
			case 4:
				System.out.println("enter the pos to delete ");
				 del=input.nextInt();
				 lst.deleteAtpos(del);
				 break;
			case 5:
				System.exit(0);
			case 6:
				lst.deleteAtend();
			
			
			
			
			}
		}

	}}


