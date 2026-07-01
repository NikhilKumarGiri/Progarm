package arrayProgram;

//compare the adjacent element and swap them 
public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {39,98,87,45,1,8,10,78};
		
		//outer for loop is used for the round to compare 
		//the element and it will be length-1(here it is 7)
		for(int i=0;i<a.length;i++)
		{
			//int flag=0; 
			//-i because ignore the last sorted element 
			//for is use to compare and sort the element
			for(int j=0;j<a.length-1-i;j++) 
			{
				
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					//flag=1;(it will continue the loop)
					
				}
			}
			//when the flag is 0(after sorted the array)
			//it will break the loop and print 
//			if(flag==0)
//			{
//				break;
//			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		
		

	}

}
