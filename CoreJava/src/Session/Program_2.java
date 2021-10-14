package Session;

class StudentAttributes{
	int stid;
	String name;
	String course;
	int marks;
	
	public StudentAttributes(int stid, String name, String course, int marks) {
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	public void show() {
		System.out.println("Stid: "+stid+"\t Name: "+name+"\tCourse: "+course+"\tMarks: "+marks);
	}
}

public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAttributes sa[] = new StudentAttributes[3];
		sa[0] = new StudentAttributes(1, "Mohan Lal", "CSE", 85);
		sa[1] = new StudentAttributes(2, "Shyam Prasad", "BCA", 85);
		sa[2] = new StudentAttributes(3, "Hari Singh", "BCA", 55);
		for(int i = 0; i<3; i++)
		{
			if(sa[i].course == "BCA" && sa[i].marks >60)
			{
				sa[i].show();
			}
		}

	}

}
