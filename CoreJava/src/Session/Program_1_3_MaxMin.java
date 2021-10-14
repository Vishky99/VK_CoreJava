package Session;

import java.util.Scanner;

public class Program_1_3_MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[] = new int[5];
		int max = -99999999,min = 99999999,max_i = -1,min_j = -1, temp;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(int i = 0; i<5; i++)
		{
			Arr[i] = a.nextInt();
			if(Arr[i]>max)
			{
				max = Arr[i];
				max_i = i;
			}
			if(Arr[i]<min)
			{
				min = Arr[i];
				min_j = i;
			}
		}
		temp = Arr[max_i];
		Arr[max_i] = Arr[min_j];
		Arr[min_j] = temp;
		
		System.out.println("Modified array: ");
		for(int i = 0; i<5; i++)
			System.out.print(Arr[i]+" ");
		a.close();

	}

}
