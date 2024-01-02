package leetcode;

public class SumIntegerArrayTarget {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target)
					return new int[] {i,j};
			}
		}
		return null;

	}

	public static void main(String[] args) {
		int[]nums= {1,2,3};
		SumIntegerArrayTarget sumIntegerArrayTarget = new SumIntegerArrayTarget();
		System.out.println(sumIntegerArrayTarget.twoSum(nums, 3));
	}
}
