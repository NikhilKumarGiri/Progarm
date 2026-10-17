package arrayProgram_medium;

import java.util.Arrays;

public class MoveZeroFirst {

	public static void main(String[] args) {
		int index = 0;
		int a[] = { -1, 12, 0, 3, 0, 4, 5, 9, 0 };
		int[] result = new int[a.length];
		// Step 1: Put all zeros first
		for (int num : a) {
			if (num == 0) {
				result[index++] = 0;
			}
		}
		// Step 2: Put non-zero elements after zeros
		for (int num : a) {
			if (num != 0) {
				result[index++] = num;
			}
		}
		System.out.println(Arrays.toString(result));

	}

}
