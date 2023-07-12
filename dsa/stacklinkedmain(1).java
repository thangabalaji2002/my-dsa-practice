package dsa;

public class stacklinkedmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stacklinked <Integer>s =new stacklinked<Integer>();
		s.push(1);
		s.push(11);
		s.push(111);
		s.push(3);
		s.push(9);
		System.out.println("seeked value "+s.seek());
		s.display();
	
	}

}
