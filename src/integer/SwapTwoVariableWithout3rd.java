package integer;

public class SwapTwoVariableWithout3rd {

	public static void main(String[] args) {
		int i=99;
		int j=89;
		i=i-j;//10
		j=i+j;//89+10=99
		i=j-i;//99-10=89
		System.out.println(i);
		System.out.println(j);
	}

}
