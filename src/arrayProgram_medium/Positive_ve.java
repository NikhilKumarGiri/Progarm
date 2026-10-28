package arrayProgram_medium;

public class Positive_ve {
	public static void method(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(0<arr[i])
			{
				System.out.print("positive-> "+arr[i]);
			}
			else
			{
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int []arr= {1,2,3,4,-9,2,-9,19};
method(arr);
	}

}
