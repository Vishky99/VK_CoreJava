package Lab;

interface Test {
	int square(int a);
}

class Arithmetic implements Test{
		
	public int square(int x) {
		return x*x;
	}
}

public class LabUnit_6_3_ToTestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic a = new Arithmetic();
		System.out.println("\nThe square of 64 is "+a.square(64));

	}

}
