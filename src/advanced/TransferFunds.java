package advanced;
class Login1{
	void verifylogin()
	{
		System.out.println("Login Successful: \nCongratulations!!!");
	}
}
class AddBen1 extends Login1{
	void verifyaddben()
	{
		System.out.println("Ben. verified successfully!!");
		verifylogin();
	}
}
public class TransferFunds extends AddBen1 {
	void verifyfunds(int x)
	{
		System.out.println("Funds verified successfully!");
		verifyaddben();
	}
	public static void main(String[] args) {
		TransferFunds obj1 = new TransferFunds();
		obj1.verifyfunds(12345);
	}
}
