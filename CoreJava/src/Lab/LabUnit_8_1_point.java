package Lab;

class Point{
	private int x,y;
	
	public Point() {
		System.out.println("Constructor called");
	}
	
	void setX(int a) {
		this.x = a;
		System.out.println("X = "+x);
	}
	
	void setY(int b) {
		this.y = b;
		System.out.println("Y = "+y);
	}
	
	void setXY(int a, int b) {
		this.x = a;
		this.y = b;
		System.out.println("X = "+x+"\tY = "+y);
	}
}

public class LabUnit_8_1_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point P = new Point();
		P.setX(10);
		P.setY(20);
		P.setXY(50,60);

	}

}
