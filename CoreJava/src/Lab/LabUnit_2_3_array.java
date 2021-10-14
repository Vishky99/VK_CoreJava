package Lab;

public class LabUnit_2_3_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ar[] = {1,2,3,4,5,6};	//1D array
		System.out.println(Ar.length);
		int Ar2[][] = {{1,2,3},{4,5,6},{7,8,9}};	//2D array
		System.out.println(Ar2+"\n");
		int Ar3[][][] = {{{1,2,3},{4,5,6},{7,8,9}},		//3D array
				{{11,12,13},{14,15,16},{17,18,19}},
				{{21,22,23},{24,25,26},{27,28,29}}};
		for(int i =0;i<3; i++)
		{
			for(int j =0;j<3; j++)
			{
				for(int k =0;k<3; k++)
					System.out.println("Arr[" + i+ "]["+ j + "]["+ k + "] = "+ Ar3[i][j][k]);
			}
		}
	}

}
