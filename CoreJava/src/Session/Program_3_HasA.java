package Session;

class Employee{
	int eid;
	String ename;
	int esal;
	Project project;
	public Employee(int eid, String ename, int esal, Project project) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.project = project;
	}

	public void show() {
		System.out.println("Employee Id : " + eid + "\nEmployee name : "+ename+
				"\nEmployee Salary : "+esal+ "\nProject ID : "+project.pid+
				"\nProject Name : "+project.pname+ "\nProject Location : "+project.plocation+"\n");
	}

}

class Project{
	int pid;
	String pname;
	String plocation;
	public Project(int pid, String pname, String plocation) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}

}

public class Program_3_HasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project mob_app = new Project(1, "Mobile App for Project Management", "Noida");
		Project web_app = new Project(2, "E-Commerce Web App", "Mumbai");


		Employee e[] = new Employee[4];
		e[0] = new Employee(1, "Mohan Lal", 15000, mob_app);
		e[1] = new Employee(2, "Shyam Prasad", 28000, web_app);
		e[2] = new Employee(3, "Hari Singh", 29000, mob_app);
		e[3] = new Employee(4, "Suresh Yadav", 10000, web_app);

		for(Employee emp : e) {
			if(emp.esal > 25000 && emp.project == web_app) {
				emp.show();
			}
		}
	}

}


