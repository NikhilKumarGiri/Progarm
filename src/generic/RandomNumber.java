package generic;

import leetcode.BinarytreeSum;

public class RandomNumber {

	public static void main(String[] args) {
		double random=Math.random();
		int range=100000;

		System.out.println((int)(random*range));
		BinarytreeSum.treesum(10, 8, 2);
	}

}
