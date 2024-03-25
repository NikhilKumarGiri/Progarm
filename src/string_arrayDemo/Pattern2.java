package string_arrayDemo;

public class Pattern2 {
public static void main(String[] args) {
	int[][]pattern= {{1},{1,1},{2,2,2},{1,1,1,1},{2,2,2,2,2}};
	for(int i=0;i<pattern.length;i++)
	{
		for(int j=0;j<pattern[i].length;j++)
		{
			System.out.print(pattern[i][j]+ " ");
		}System.out.println();
	}
}
}
