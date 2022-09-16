package oops;
class Grandfather{
	void m1()
	{
		System.out.println("This is grandfather class!");
	}
}
class Father extends Grandfather{
	void m2()
	{
		System.out.println("This is father class!");
		m1();
	}
}
public class ChildInheritance extends Father {
	void m3()
	{
		System.out.println("This is child class!");
		m2();
	}
	public static void main(String[] args) {
		ChildInheritance obj = new ChildInheritance();
		obj.m3();
	}
}
