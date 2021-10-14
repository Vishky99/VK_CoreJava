package Session;

import java.util.Scanner;

public class Program_1_1_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;    
		
		System.out.println("Enter number:");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		temp=n;    
		while(n>0){    
			r=n%10;  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("Palindrome number ");    
		else    
			System.out.println("Not a palindrome number");
		a.close();

	}

}
