package Statements;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=70;
    int b=80;
    if (a+b > 50) {
    	System.out.println("greaterthan 50");
    }else {
    	System.out.println("not printed");
    }
    if (a+b < 50) {
    	System.out.println("lessthan 50");
    }
    if (a+b < 50) {
    	System.out.println("geaterthan 50");
    }
    else {
    	System.out.println("None of the above"); //all statements are printed here
    }
	}

}
