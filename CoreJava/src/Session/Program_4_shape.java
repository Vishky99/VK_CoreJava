package Session;

class Shape{
	void area() {
		System.out.println("\nCalculating area:");
	}
	void draw() {
		System.out.println("Drawing shape:");
	}
}

class Circle extends Shape{
	void area(double r) {
		super.area();
		System.out.println("Area of circle: "+(3.14*r*r));
	}
	void draw() {
		super.draw();
		System.out.println("Circle drawn");
	}
}

class Triangle extends Shape{
	void area(double h, double b) {
		super.area();
		System.out.println("Area of triangle: "+(h*b)/2);
	}
	void draw() {
		super.draw();
		System.out.println("Triangle drawn");
	}
}

class Square extends Shape{
	void area(double a) {
		super.area();
		System.out.println("Area of square: "+a*a);
	}
	void draw() {
		super.draw();
		System.out.println("Square drawn");
	}
}

public class Program_4_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.area(23.05);
		c.draw();
		
		Triangle t = new Triangle();
		t.area(15, 9);
		t.draw();
		
		Square s = new Square();
		s.area(5);
		s.draw();

	}

}
