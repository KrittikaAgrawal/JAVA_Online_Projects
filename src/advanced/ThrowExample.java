package advanced;
class Advance1{
	void check(int x) {
		if (x < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + x + " is " + (x*x));  
        }  
	}
}
public class ThrowExample extends Advance1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExample obj= new ThrowExample();
		obj.check(0);
	}
}
