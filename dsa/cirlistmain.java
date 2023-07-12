package dsa;

public class cirlistmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cirlinkedlist <String>a=new cirlinkedlist<String> ();
		a.insertatbeg("abi");
		a.insertatlst("dhaya");
		a.insertatbeg("abinaya");
		a.insertatbeg("ashok");
		a.insertatbeg("abivk");
		System.out.println(a.delatbeg());
		a.delatlast();
		a.display();

	}

}
