package advanced;
class Login{
	void verifylogin()
	{
		System.out.println("Login Successful: \nCongratulations!!!");
	}
}

public class AddBen extends Login {
	void verifyaddben(int x)
	{
		System.out.println("Ben. verified successfully!!");
		verifylogin();
	}
	public static void main(String[] args) {
		AddBen obj = new AddBen();
		obj.verifyaddben(12345);
	}

}
