package integer;

public class Print1_100_withoutFor {
	

	public static void main(String[] args) {
		print(1);
	}
	public static void print(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			print(1);
			
		}
	}

}
