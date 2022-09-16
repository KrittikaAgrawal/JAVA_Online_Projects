package Basicsofprogram;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd obj = new EvenOdd();
		obj.func(20);
	}
	void func(int n)
	{
		if(n%2==0)
			System.out.println("Number is an even number!");
		else
			System.out.println("Number is an odd number");
	}

}
