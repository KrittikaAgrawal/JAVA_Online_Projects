package oops;

public class MainOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is default main function!!!");
		MainOverloading obj= new MainOverloading();
		obj.main();
		obj.main(5);
	}
	public static void main(int args)
	{
		System.out.println("This is user defined integer parameter main function!!!");
	}
	public static void main()
	{
		System.out.println("This is user defined no parameter main function!!!");
	}
}
