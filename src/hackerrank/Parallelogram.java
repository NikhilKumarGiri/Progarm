package hackerrank;

import java.util.Scanner;

public class Parallelogram {
	static boolean flag=true;
	static Scanner s=new Scanner(System.in);
	
	static int B=s.nextInt();
	static int H=s.nextInt();
	
	public static void main(String[] args) {
		
		if(flag && B>0 && H>0){
			int area=B*H;
			System.out.print(area);
		}
		else
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
	}

}
