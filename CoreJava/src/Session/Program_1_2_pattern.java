package Session;

import java.util.Scanner;

public class Program_1_2_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row = a.nextInt();
		int k = 1;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		a.close();

	}

}
