package stringProgram;

import java.util.HashSet;

public class Duplicate_string_usinghashset {

	public static void main(String[] args) {
		boolean flag=false;
		String arr[]= {"java","c","c++"};
		HashSet<String> l= new HashSet<>();
		//storing the value of array in to string variable
		//for(String s: arr)
		for(int i=0;i<arr.length;i++)
		{
			if(l.add(arr[i])==false)
			{
				System.out.println("Duplicated are :" +arr[i]);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("no duplicate found");
	}

}
