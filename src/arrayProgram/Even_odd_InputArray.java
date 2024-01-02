package arrayProgram;

import java.util.Scanner;

public class Even_odd_InputArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even numbers are :" +arr[i]);
			}
			else {
				System.out.println("Odd numbers are :" +arr[i]);
	
			}
		}
		sc.close();

	}

}
