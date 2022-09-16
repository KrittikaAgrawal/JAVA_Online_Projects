package oops;
public class MultiplyMethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyMethodOverloading obj = new MultiplyMethodOverloading();
		int pro = obj.mul(5, 3);
		System.out.println("Multiplication of two numbers is: "+ pro);
		int pro1 = obj.mul(2, 3, 5);
		System.out.println("Multiplication of three numbers is: "+ pro1);
		float pro2= obj.mul(1f, 3f);
		System.out.println("Multiplication of two float numbers is: "+ pro2);
	}
	int mul(int a, int b)
	{
		return(a*b);
	}
	int mul(int a, int b, int c)
	{
		return(a*b*c);
	}
	float mul(float a, float b)
	{
		return(a*b);
	}
}
