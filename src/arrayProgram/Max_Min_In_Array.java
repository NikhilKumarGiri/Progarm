package arrayProgram;

public class Max_Min_In_Array {

	public static void main(String[] args) {
		int arr[]= {12,0,-1,1,2,3,37,9,9,57,98};
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
