package Lab;

public class LabUnit_4_2 {
	
	LabUnit_3_1 r;
	
	void createhouse() {
		r = new LabUnit_3_1();
	}
	
	void display() {
		r.displaydata();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabUnit_4_2 h = new LabUnit_4_2();
		h.createhouse();
		h.display();

	}

}
