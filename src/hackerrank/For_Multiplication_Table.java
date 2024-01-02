package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1<=i<=10) should be printed
 *  on a new line in the form: N x i = result.

Input Format

A single integer, N.

Constraints

Output Format

Print 10 lines of output; each line i (where  1<=i<=10) contains the  of  in the form:
N x i = result.*/
public class For_Multiplication_Table {    
	public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());
    int result;
    for(int i=1;i<=10;i++)
    {
    result=N*i;
    System.out.printf("%d x %d = %d\n",N,i,result);
    }

    bufferedReader.close();
}

}
