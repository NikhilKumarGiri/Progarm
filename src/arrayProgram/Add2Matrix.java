package arrayProgram;

public class Add2Matrix {
	public static void main(String[] args) {

		int[][]a= {{1,2},{3,4}};
		int [][]b= {{2,1},{9,0}};
		int sum;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				sum=a[i][j]+b[i][j];
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}
