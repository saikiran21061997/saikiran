package Oops;
class first{
	void method1() {
		System.out.println("first_method");
	}
	void method2() {
		System.out.println("second_method");
		this.method1();
	}
}

public class this_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first fst = new first();
		fst.method2();
		

	}

}
