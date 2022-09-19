package pack2;
import pack1.FunctionsExample;

public class ImportedFunctions {
	void printing() {
		System.out.println("This is Package 2 Function!");
	}

	public static void main(String[] args) {
		ImportedFunctions ob= new ImportedFunctions();
		FunctionsExample obj = new FunctionsExample();
		ob.printing();
		obj.printing();
	}
}
