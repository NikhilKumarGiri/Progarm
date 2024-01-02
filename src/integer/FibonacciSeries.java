package integer;

public class FibonacciSeries {
	static void fibonacci(int limit)
	{
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=2;i<limit;i++)
		{
			int sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
	}
	public static void main(String[] args) {
		fibonacci(10);
	}

}
