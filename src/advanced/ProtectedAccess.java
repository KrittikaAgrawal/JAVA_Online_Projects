package advanced;
class A{
	public int x=100;
	private int y=50;
protected void msg(){
	System.out.println("Hello this is the protected access modifier!");}  
}  
public class ProtectedAccess extends A {
	public static void main(String[] args) {
		ProtectedAccess obj= new ProtectedAccess();
		obj.msg();
		System.out.println(obj.x);
	}

}