package jumping_statements;

public class Continue_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //if you declare continue keyword in execute the flow
		for (int i=0; i<10; i++)  {
			if (i==6) {
			continue;
			}
		System.out.print(i); //6 will skip
		}
	}

}
