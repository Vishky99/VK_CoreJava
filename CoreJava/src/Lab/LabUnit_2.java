package Lab;

public class LabUnit_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		a++;
		int c = ~b;
		System.out.println(a);	//increment operator
		System.out.println(c);	//bitwise compliment operator
		System.out.println((a+b)*c);	//arithmetic operator
		System.out.println(c>b);	//relational operator
		System.out.println(b>>2);	//bitwise operator
		System.out.println(a>b?"a>b":"b>a");	//conditional operator

	}

}
