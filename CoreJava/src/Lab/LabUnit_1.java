package Lab;

public class LabUnit_1 {
	
	static boolean val1;
	static double val2;
	static float val3;
	static int val4;
	static long val5;
	static String val6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String a = "Vishal";
		String b = "vishal";
		String c = "Vishal";
		
		System.out.println("Hello ! First lab work.\n");
		
		System.out.println("Default values are");
		System.out.println("Val1 = " + val1);
		System.out.println("Val2 = " + val2);
		System.out.println("Val3 = " + val3);
		System.out.println("Val4 = " + val4);
		System.out.println("Val5 = " + val5);
		System.out.println("Val6 = " + val6);	
		
		if(a==b) {
			System.out.println("Strings a & b are equal.");
		}
		if(a==c) {
			System.out.println("Strings a & c are equal.");
		}
		if(c==b) {
			System.out.println("Strings b & c are equal.");
		}

	}

}
