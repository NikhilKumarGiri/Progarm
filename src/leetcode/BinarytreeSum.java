package leetcode;

public class BinarytreeSum {

	public static void main(String[] args) {
		
		//BinarytreeSum b=new BinarytreeSum();
		System.out.println(treesum(0,15,4));
	}
	public static boolean treesum(int tree,int left,int right)
	{
		if(tree==left+right)
		{
			return true;
		}
		return false;
		
	}

}
