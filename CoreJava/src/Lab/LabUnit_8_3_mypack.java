package Lab;

class Circle1{
	public double r;
	public void area() {
		System.out.println("Area of circle = "+(3.14*r*r));
	}
}

public class LabUnit_8_3_mypack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c = new Circle1();
		c.r = 20.5;
		c.area();
	}

}
