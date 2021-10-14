package Lab;

class Base1{    
	void msg()throws Exception {  
		System.out.println("Base class method");  
	}    
}    

public class LabUnit_10_3 extends Base1 {
	
	void msg()throws ArithmeticException {  
		System.out.println("Derived class method");  
	}    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base1 p = new LabUnit_10_3();    

		try {    
			p.msg();    
		}  
		catch(Exception e) {
			System.out.println("Exception catched: "+e);
		}

	}

}
