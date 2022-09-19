package pack1;

public class FunctionsExample {
	public void printing() {
		System.out.println("This is the Package-1 Function!");
		System.out.println("(This is the imported Function)");
	}
	public static void main(String[] args) {
		FunctionsExample obj = new FunctionsExample();
		obj.printing();
	}

}
