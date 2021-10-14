package Lab;

class Base{
	void func() {
		System.out.println("Base class");
	}
}

public class LabUnit_9_1_overriding extends Base {
	
	void func() {
		System.out.println("Derived class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabUnit_9_1_overriding f = new LabUnit_9_1_overriding();
		f.func();
	}

}
