package Lab;

public class LabUnit_3_1 {
	
	int roomno;
	String roomtype;
	double roomarea;
	boolean ACmachine;
	
	public void setdata(int rno, String rty, double rar, boolean ac)
	{
		this.roomno = rno;
		this.roomtype = rty;
		this.roomarea = rar;
		this.ACmachine = ac;
	}
	
	public void displaydata()
	{
		System.out.println(roomno);
		System.out.println(roomtype);
		System.out.println(roomarea);
		System.out.println(ACmachine);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabUnit_3_1 room = new LabUnit_3_1();
		room.setdata(12, "Bed Room", 25.25, true);
		room.displaydata();

	}

}
