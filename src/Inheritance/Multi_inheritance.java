package Inheritance;
class one {
	public void lev() {
		System.out.println("123");
	}
}
class two extends one {
	public void levi() {
		System.out.println("456");
	}
}
class three extends two {
	public void tech () {
		System.out.println("789");
	}
}

public class Multi_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*class A---------->class B-------->class C
        */
		three ss = new three ();
		ss.lev ();
		ss.levi();
		ss.tech();
		
			
		}
	}


