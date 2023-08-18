package string_arrayDemo;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String last4char=str.substring(str.length()-4);
		System.out.println(last4char);
	
		}

}
