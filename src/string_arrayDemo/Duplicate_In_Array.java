package string_arrayDemo;
public class Duplicate_In_Array {

	public static void main(String[] args) {
		boolean flag=false;
		String arr[]= {"java","c","c++","java"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element is " +arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		System.out.println("No duplicated element found");

		
	}

}
