package Lab;

import java.io.*;

public class LabUnit_11_2_RenameFile {
	public static void main(String args[]){
		for (int i = 0; i<args.length; i++){
			File f = new File("V:\\java", args[i]);
			File f1 = new File("V:\\java\\renfile");
			if (f.exists()){
				System.out.println(f + " does exists.");
				System.out.println("Its size is" + f.length()+ "bytes");
				f.renameTo(f1);
				System.out.println("Renamed file name :" + f1 + (i+1));
				System.out.println("deleting the renamed file"+f1+(i+1));
				f.delete();
			}
			else
				System.out.println(f +" does not exists");
		}
	}
}