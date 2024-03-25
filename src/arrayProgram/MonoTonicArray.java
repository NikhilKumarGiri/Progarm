package arrayProgram;
//Array should be in ascending or decreasing order
public class MonoTonicArray {
	static boolean checkMonotonic(int []a){
		boolean increase=true;
		boolean decrease=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				decrease=false;
			}
			else
			{
				increase=false;
			}
		}
		if(decrease || increase)
		{
			return true;

		}
		return false;
		
	}
	public static void main(String[] args) {
		int []a= {1,2,67,3,7,8};
		System.out.println(checkMonotonic(a));
	}

}
