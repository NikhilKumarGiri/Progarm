package pratice;

public class Miss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,5,9};
		for(int i=1;i<=10;i++)
		{
			boolean flag=false;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println(i);
			}
		}

	}

}
