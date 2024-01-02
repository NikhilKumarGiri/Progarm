package integer;


public class MultiplicationTable {
static void table(int num)
{
	for(int i=1;i<=10;i++)
	{
		int result=num*i;
		System.out.println(num+" * "+i+" = "+ result);
	}
}
public static void main(String[] args) {
	table(3);
}
}
