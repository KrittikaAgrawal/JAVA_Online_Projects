package Basicsofprogram;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "krittika";
		char[] str= name.toCharArray();
		Arrays.sort(str);
		System.out.println("String in ascending order is: "+ new String(str));
	}

}
