 package arrayProgram;

public class SecondLargest {

	private static void second(int[] a) {
		int largest=Integer.MIN_VALUE;//-2147483648(-2pow(31))
		int secondlarg=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>largest)
			{
				secondlarg=largest;
				largest=a[i];
			}
			else if(a[i]>secondlarg && a[i]!=largest)
			{
				secondlarg=a[i];
			}
		}			System.out.println(secondlarg);
		System.out.println(largest);

	}
	public static void main(String[] args) {
		int[]a= {1,2,3,3,8,9,13,23,34,99,123};
		second(a);
	}
}
