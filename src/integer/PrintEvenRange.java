package integer;

public class PrintEvenRange {
	static void even(int rangefrom,int to)
	{
		for(int i=rangefrom;i<=to;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		even(10,20);
	}

}
