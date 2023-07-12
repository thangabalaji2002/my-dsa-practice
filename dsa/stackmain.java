package dsa;

public class stackmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack<Integer> a =new stack<Integer>();
		a.push(5);
		a.push(3);
		a.push(1);
		a.push(10);
		a.push(9);
		System.out.println("poped value: "+a.pop());
		a.display();
		
		
	}

}
