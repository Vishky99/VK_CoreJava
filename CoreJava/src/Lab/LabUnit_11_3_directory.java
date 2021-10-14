package Lab;

import java.io.*;

public class LabUnit_11_3_directory {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("V:\\java\temp");
		if (f.mkdir())
			System.out.println("created a directory");
		else
			System.out.println ("unable to create a directory");

	}

}
