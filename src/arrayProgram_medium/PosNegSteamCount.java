package arrayProgram_medium;

import java.util.Arrays;

public class PosNegSteamCount {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,-9,2,-9,19};
		long positives = Arrays.stream(arr).filter(num -> num >= 0).count();
		long negatives = Arrays.stream(arr).filter(num -> num < 0).count();

		System.out.println("Positives: " + positives + ", Negatives: " + negatives);

	}

}
