package Basicsofprogram;
public class Functions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions obj = new Functions();
		int a = obj.add(2, 3);
		System.out.println("Addition of numbers is: "+ a);
		int s= obj.sub(5, 2);
		System.out.println("Subtraction of numbers is: "+ s);
		obj.multiply(2, 3);
		obj.divide(10, 2);
	}
	int add(int a, int b)
	{
		return(a+b);
	}
	int sub(int a, int b)
	{
		return(a-b);
	}
	void multiply(int a, int b)
	{
		System.out.println("Multiplication of numbers is: "+ a*b);
	}
	void divide(int a, int b)
	{
		if(b==0)System.out.println("Division by 0! ");
		else System.out.println("Division of numbers is: "+ (a/b));
	}
}
