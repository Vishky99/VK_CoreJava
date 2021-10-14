package Lab;

import java.util.Scanner;

public class LabUnit_2_4_CLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a string:");
		String a = inp.nextLine();
		System.out.println(a);
		int s = 0;
		int inv = 0;
		System.out.println("Enter the numbers:");
		for(int i=0; i<args.length;i++)
		{
			try {
				s += Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e){
				inv++;
			}
		}
		System.out.println("Sum = "+s);
		System.out.println("Number of invalid elements: "+inv);
		inp.close();
	}
}
