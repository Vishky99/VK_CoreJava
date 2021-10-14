package Lab;

import java.util.Scanner;

public class LabUnit_2_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[] = {2,4,3,1,6,7,9,5,8};
		int temp = 0;
		System.out.println("Elements of original array: ");    
        for (int i = 0; i < Arr.length; i++)    
            System.out.print(Arr[i] + " ");
        for (int i = 0; i < Arr.length; i++) {     
            for (int j = i+1; j < Arr.length; j++) {     
               if(Arr[i] > Arr[j])
               {    
                   temp = Arr[i];    
                   Arr[i] = Arr[j];    
                   Arr[j] = temp;    
               }     
            }     
        }
        System.out.println("\nElements of array sorted in ascending order: ");    
        for (int i = 0; i < Arr.length; i++)   
            System.out.print(Arr[i] + " ");
        
        System.out.println("\n");
        
        Scanner coeff = new Scanner(System.in);
        System.out.println("Quadratic equation roots");
        System.out.println("Enter coefficient of x^2: ");
        int a = coeff.nextInt();
        System.out.println("Enter coefficient of x: ");
        int b = coeff.nextInt();
        System.out.println("Enter constant value: ");
        int c = coeff.nextInt();
        double r1,r2;
        r1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
        r2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
        System.out.println("The 2 roots are: \nroot1 = "+r1+"   root2 = "+r2);
        coeff.close();
	}

}
