package arrayProgram;

public class SortOrNot {

	static boolean isSort(int a[]) {
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<a[i-1]) {
				return false;
			}
		}
		return true;
		
		}

	public static void main(String args[]) {
		int a[] = { 98,1, 4, 6, 8,9 };
		System.out.println(isSort(a));
	}

}
