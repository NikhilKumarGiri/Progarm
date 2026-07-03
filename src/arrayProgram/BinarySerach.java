package arrayProgram;

public class BinarySerach {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,8,9,13,20,93,203};
		int start=0;
		int end=a.length-1;		
		int target=209;	
		boolean flag=false;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(a[mid]==target)
			{
				//target=mid;
				System.out.println(mid);
				flag=true;
				break;
				
			}
			else if(a[mid]<target)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		if(!flag)
		{
			System.out.println("Not found");
		}
		

	}

}
