package advanced;
class Advance{
	void message() throws ArithmeticException{
		System.out.println(" This is Arithmetic exception throwing block !!");
	}
}
public class ThrowsExample extends Advance{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample obj= new ThrowsExample();
		try {
			obj.message();
		}
		catch(ArithmeticException e) {
			System.out.println(" This is Arithmetic exception catch block !!!");
		}
		finally {
			System.out.println(" This is final block and our rest of the code comes here.");
		}
	}
}
