package advanced;
class B{  
	void msg(){ //default method
	System.out.println("Hello this is the default access modifier!");}  
} 
public class DefaultAccess extends B{
	void printing1(int x ) {
		System.out.println("The value of x in Default is : "+ x);
	}
	public static void main(String[] args) {
		int a=100;// default variable
		DefaultAccess obj= new DefaultAccess();
		obj.printing1(a);
		obj.msg();
	}
}