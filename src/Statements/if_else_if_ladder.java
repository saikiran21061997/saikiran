package Statements;

public class if_else_if_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=30;
int b=40;
if (a+b > 50) {
System.out.println("greaterthan 50");
}
else if (a+b < 50) {
	System.out.println("lessthen 50");
}
else {
	System.out.println("None of the above");
	/*if 1st statement is satisfy then the first one is going to print
	 * rest are ignored. if 1st one is not satisfied go with else if statement 
	 * if any of them is satisfy then it is going to print
	 * if all are flase and not satisfing then else statement going to print
	 */
}
}
}


