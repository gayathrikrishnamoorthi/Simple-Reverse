package sample;

import java.util.Scanner;

public class ReverseString {
	public static String ReverseString(String str) {
		String str1="";
		char ch;
		int k=0;
		for(int i=str.length()-1;i>=0;i--) {
			ch=str.charAt(i);
			str1+=ch;
			
		}
		return str1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String st=ReverseString(str);
		System.out.println(st);
	}

}


