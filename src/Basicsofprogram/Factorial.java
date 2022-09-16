package Basicsofprogram;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int num=5;
		int fact=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of the number "+num+" is:"+ fact);

	}

}
