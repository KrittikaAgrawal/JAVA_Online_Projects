package advanced;
class C{  
private void msg(){// private method to class C
	System.out.println("Hello this is the private access modifier!");}  
} 
public class PrivateAccess extends C {
	private void printing(int x ) { // private method to class PrivateAccess
		System.out.println("The value of x in Private is : "+ x);
	}
	public static void main(String[] args) {
		PrivateAccess obj= new PrivateAccess();
		obj.printing(100);
	}

}
