package Basicsofprogram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Krittika";
		String str1="";
		int i=0;
		int len=str.length();
		for(i=len-1;i>=0;i--)
		{
			str1= str1 + str.charAt(i);
		}
		System.out.println("Reverse string is: "+ str1);
	}

}
