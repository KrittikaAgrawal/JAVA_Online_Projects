package Basicsofprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj= new PrimeNumber();
		obj.prime(13);
	}
	void prime(int n)
	{	boolean flag=false;
		for(int i=2;i<=(n/2);i++)
		{
			if(n%2==0)
				{ flag=true;
				System.out.println("Number is not prime!");
				break;}
		}
		if (flag==false)
			System.out.println("Number is a prime!");
	}

}
