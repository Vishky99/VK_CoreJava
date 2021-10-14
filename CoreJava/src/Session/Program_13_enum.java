package Session;

/*public class Program_13_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/

import java.util.Scanner;

enum Subject {
	JAVA, CPP, C, PYTHON
}

class Studentm {
	int stid;
	String stname;
	Subject s;
	int marks;

	public Studentm(int stid, String stname, Subject s, int marks) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.s = s;
		this.marks = marks;
	}
}

public class Program_13_enum {

	public static void main(String[] args) {
		Studentm s1 = new Studentm(11, "abc", Subject.JAVA, 600);
		Studentm s2 = new Studentm(12, "def", Subject.CPP, 500);
		Studentm s3 = new Studentm(13, "ghi", Subject.C, 400);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject to disply student:");
		Studentm sm[] = { s1, s2, s3 };
		String sub = sc.next().toUpperCase();
		//Subject s;
		System.out.println("Details students:");
		for (Studentm std : sm) {
			if (Subject.valueOf(sub)==(std.s)) {
				System.out.println("sid:"+std.stid+", sname:" + std.stname + ", subject :" + std.s+", Marks:"+std.marks );
			}
		}
		sc.close();
	}

}