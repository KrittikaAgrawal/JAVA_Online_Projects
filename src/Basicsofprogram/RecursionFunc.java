package Basicsofprogram;

public class RecursionFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionFunc obj= new RecursionFunc();
		int fac= obj.fact(5);
		System.out.println("Factorial of Number is: "+fac);
	}
	int fact(int n)
	{
		if(n==0)
			return (1);
		else 
			return (n*fact(n-1));
	}

}
