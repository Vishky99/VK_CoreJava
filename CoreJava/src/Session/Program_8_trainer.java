package Session;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Trainer{
	int tr_id;
	String name;
	String course;
	int salary;
	public Trainer(int tr_id, String name, String course, int salary) {
		this.tr_id = tr_id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	};

	void display() {
		System.out.println("ID: "+tr_id+"\tName: "+name+"\tCourse: "+course+"\tSalary: "+salary);
	}

}

public class Program_8_trainer {

	static boolean filterTrainer(Trainer t) {
		if(t.course.equalsIgnoreCase("JAVA") && t.salary>20000)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trainer> tr = new ArrayList<Trainer>();
		tr.add(new Trainer(1, "Mohan Lal", "SQL", 20000));
		tr.add(new Trainer(2, "Shyam Prasad", "Python", 26000));
		tr.add(new Trainer(3, "Hari Singh", "JAVA", 26000));
		tr.add(new Trainer(4, "Suresh Yadav", "C++", 23000));
		tr.add(new Trainer(5, "Dayanand Sharma", "JAVA", 38000));

		List<Trainer> filteredTr = new ArrayList<Trainer>();

		for(Iterator<Trainer> itr = tr.iterator(); itr.hasNext();) {
			Trainer trainer = itr.next();
			if(filterTrainer(trainer)) {
				filteredTr.add(trainer);
				itr.remove();
			}
		}

		Iterator<Trainer> iterator = filteredTr.iterator();
		System.out.println("New List: ");

		while(iterator.hasNext()) {
			iterator.next().display();
		}
	}

}