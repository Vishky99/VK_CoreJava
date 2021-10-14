package Lab;

public class LabUnit_2_5_patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 || j==2*i-1)
					System.out.print("1"+" ");
				else
					System.out.print("0"+" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("\n");
		
		for(int i=5;i>=0;i--)
		{
			//System.out.println(i);
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("\n");
		for(int i=1;i<=5;i++)
		{
			//System.out.println(i);
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
}
