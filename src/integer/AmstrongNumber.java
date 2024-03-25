package integer;

public class AmstrongNumber {
	static void amstrong(int n)
	{
		String s=String.valueOf(n);
		double l=s.length();
		int digit,temp=n;
		double sum=0;
		for(int i=0;i<=l;i++) {
			digit=n%10;
			sum=sum+Math.pow(digit, l);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		}
	public static void main(String[] args) {
		amstrong(153);
	}

}
