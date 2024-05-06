package Inheritance;

	class first {
		public void method1() {
			System.out.println("Levitica");

	}
	}
		class second extends first {
		public void method2() {
			System.out.println("Technologies ovt ltd");
		}
		}
public class Single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second ss=new second();
		ss.method1();
		ss.method2();
		}

}
