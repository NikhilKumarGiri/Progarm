package arrayProgram;

import java.util.Arrays;

public class SortArray1ForLoop {

	public static void main(String[] args) {
		int[] a = { 98,1, 5, 9, 7, 8, 10, 2, 9 };
		System.out.println("Before sorting the array:  " +Arrays.toString(a));
		sortarray(a);
	}

	static void sortarray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i=-1;
			}

		}System.out.print("After sorting array:  "+Arrays.toString(a));

	}

}
