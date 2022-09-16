package Basicsofprogram;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=3;
		int c=5;
		if (a>=b && a>=c)
		{
			System.out.println(a+" :First number is largest");
		}
		else if (b>=a && b>=c)
		{
			System.out.println(b+" :Second number is largest");
		}
		else
		{
			System.out.println(c+" :Third number is largest");
		}
	}
}
