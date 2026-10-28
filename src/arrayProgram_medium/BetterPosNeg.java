package arrayProgram_medium;

public class BetterPosNeg {
	public static void better(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((0<arr[i]?"postive->":"negative->")+arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,-9,2,-9,19};
		better(arr);
	}

}
