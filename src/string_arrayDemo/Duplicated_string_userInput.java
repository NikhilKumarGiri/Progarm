package string_arrayDemo;

import java.util.Scanner;

public class Duplicated_string_userInput {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		String arr[]= new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element is " +arr[j]);
					flag=true;
				}
			}
		}
		if(flag==false)
		System.out.println("No duplicated element found");


	}

}
