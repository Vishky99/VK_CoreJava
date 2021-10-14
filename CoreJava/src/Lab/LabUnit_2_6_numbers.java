package Lab;

import java.util.Scanner;

public class LabUnit_2_6_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number to check for prime: ");
		int a = num.nextInt();
		int f = 0;
		for(int i=2; i<a; i++)
		{
			if(a%i == 0)
			{
				f = 1;
				break;
			}
		}
		if(f == 0)
			System.out.println(a+" is a prime number.");
		else
			System.out.println(a+" is not a prime number.");
		
		System.out.println("Enter number to add digits: ");
		int b = num.nextInt();
		int sum = 0;
		while(b!=0)
		{
			sum += b%10;
			b = b/10;
		}
		System.out.println("Sum of digits is: "+sum);
		num.close();
	}

}
