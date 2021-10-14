package Lab;

abstract class Shape{  
	abstract void draw();
	abstract void erase();
}  
 
class Rectangle extends Shape{  
	void draw()
	{
		System.out.println("drawing rectangle");
	}  
	void erase()
	{
		System.out.println("erasing rectangle");
	}
} 

class Circle extends Shape{  
	void draw()
	{
		System.out.println("drawing circle");
	}
	void erase()
	{
		System.out.println("erasing circle");
	}
}  

class Square extends Shape{  
	void draw()
	{
		System.out.println("drawing square");
	}
	void erase()
	{
		System.out.println("erasing square");
	}
}
public class LabUnit_5_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle();
		c.draw(); 
		c.erase();
		
		Shape r = new Rectangle();
		r.draw(); 
		r.erase();
		
		Shape s = new Square();
		s.draw(); 
		s.erase();

	}

}
