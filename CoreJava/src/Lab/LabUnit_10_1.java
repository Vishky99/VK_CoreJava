package Lab;

public class LabUnit_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int [-2];
			System.out.println("first element: "+a[0]);
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Generated exception: "+e);
		}
		System.out.println("Try block end");
	}

}
