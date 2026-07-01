package arrayProgram;

public class StringBubbleSort {

	public static void main(String[] args) {
		String s[] = { "Zellice", "Alice", "Lellice", };
		String temp;
		// comapreTo -compare the string in Lexicographical order
		for (int i = 0; i < s.length; i++) {
			int flag=0;
			for (int j = 0; j < s.length - 1 - i; j++) {
				if (s[j].compareTo(s[j + 1]) > 0) 
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
					flag=1;
				}
			}
			if (flag==0)
			{
				break;
			}

		}
		for(int k=0;k<s.length;k++)
		{
			System.out.println(s[k]);
		}

	}
}
