package string_arrayDemo;


public class Input_as23ad56sfdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="as23ad56sf70dds";
		char[]a=s.toCharArray();
		int sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			char c=a[i];
			char nextchar=a[i+1];
			if(Character.isDigit(c)&& Character.isDigit(nextchar))
					{
				int k=Character.getNumericValue(c);
				int j=Character.getNumericValue(nextchar);
				//System.out.println(c+""+nextchar);
				int digit=k*10+j;
				sum=sum+digit;
					}
		}System.out.println("Sum of all two digit--"+sum);

	}

}
