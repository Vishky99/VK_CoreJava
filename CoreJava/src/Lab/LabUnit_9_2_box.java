package Lab;

class Box{
	int l,b;
	public Box(int x, int y) {
		l = x;
		b = y;
	}
	
	void area() {
		System.out.println("Area of box = "+(l*b));
	}
}

class Box3d extends Box{
	int h;
	public Box3d(int x, int y, int z) {
		super(x,y);
		h = z;
	}
	void volume() {
		System.out.println("Volume of box = "+(l*b*h));
	}
}

public class LabUnit_9_2_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3d b2 = new Box3d(12,22,32);
		b2.area();
		b2.volume();

	}

}
