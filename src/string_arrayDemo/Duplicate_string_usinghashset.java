package string_arrayDemo;

import java.util.HashSet;

public class Duplicate_string_usinghashset {

	public static void main(String[] args) {
		boolean flag=false;
		String arr[]= {"java","c","c++","java"};
		HashSet<String> l= new HashSet<>();
		//storing the value of array in to string variable
		for(String s: arr)
		{
			if(l.add(s)==false)
			{
				System.out.println("Duplicated are :" +s);
				flag=true;
			}
		}
		if(flag=false)
			System.out.println("no duplicate found");
	}

}
