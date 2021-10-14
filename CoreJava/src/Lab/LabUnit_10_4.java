package Lab;

public class LabUnit_10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x = 25/0;
			System.out.println("Number = "+x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled "+e); 
		}
		finally {
			System.out.println("Finally block is always executed");
		}
	}

}
