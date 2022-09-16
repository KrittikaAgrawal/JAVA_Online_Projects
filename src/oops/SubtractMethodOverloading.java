package oops;
public class SubtractMethodOverloading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubtractMethodOverloading obj = new SubtractMethodOverloading();
		int minus = obj.sub(5, 3);
		System.out.println("Subtraction of two numbers is: "+ minus);
		int minus1 = obj.sub(20, 3, 5);
		System.out.println("Subtraction of three numbers is: "+ minus1);
		float minus2= obj.sub(10f, 3f);
		System.out.println("Subtraction of two float numbers is: "+ minus2);
	}
	int sub(int a, int b)
	{
		return(a-b);
	}
	int sub(int a, int b, int c)
	{
		return(a-b-c);
	}
	float sub(float a, float b)
	{
		return(a-b);
	}
}
