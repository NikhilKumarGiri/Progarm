package pratice;

public class Miss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5};
		int sum=0;
		int n=a.length;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		int totalsum=(n+1)*(n+2)/2;
		int miss=totalsum-sum;
		System.out.println(miss);

	}

}
