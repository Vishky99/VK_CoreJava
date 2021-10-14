package Lab;

class Outer{
	void display() {
		System.out.println("Outer class");
	}
	
	static class Inner{
		void display() {
			System.out.println("Inner class");
		}
	}
}

public class LabUnit_6_4_NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer a = new Outer();
		Outer.Inner b = new Outer.Inner();
		a.display();
		b.display();
	}

}
