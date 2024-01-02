package arrayProgram;

public class ReverseArray {

	static void reverseArray(int[] val) {
		int i = 0, j = val.length - 1;
		while (i < j) {
			int temp = val[i];
			val[i] = val[j];
			val[j] = temp;
			i++;
			j--;
		}

	}

	public static void main(String[] args) {
		int[] val= {1,2,4,5};
		for(int i=0;i<val.length;i++) {
			System.out.print(val[i]+" ");
		}
		reverseArray(val);
		System.out.println("  ");
		for(int i=0;i<val.length;i++) {
			System.out.print(val[i]+ " ");
		}
	}

}
