package oops;
public class EmployeeDetails {
	String empname;
	int empid;
	int empsalary;
	String empdesignation;
	static String compname;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails obj= new EmployeeDetails("Krittika", 123, 1200000, "Tester");
		EmployeeDetails obj1= new EmployeeDetails("Rohit", 345, 1500000, "Developer");
		initialise();
		obj.display();
		obj1.display();
	}
	EmployeeDetails(String empname1, int empid1, int empsalary1, String empdesignation1)
	{
		empname= empname1;
		empid= empid1;
		empsalary= empsalary1;
		empdesignation= empdesignation1;
	}
	static void initialise()
	{
		compname = "TietoEvry";
	}
	static {
		System.out.println("This the static block!!!");
	}
	void display()
	{
		System.out.println("Employee name is: "+empname);
		System.out.println("Employee id is: "+empid);
		System.out.println("Employee salary is: "+empsalary);
		System.out.println("Employee designation is: "+empdesignation);
		System.out.println("Company name using static is: "+compname+ "\n");
	}
}
