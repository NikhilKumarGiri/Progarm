package arrayProgram;

public class SortOrNot {

	static boolean isSort(int a[]) {
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
		
		}

	public static void main(String args[]) {
		int a[] = { 0,1, 4, 6, 8,9 };
		System.out.println(isSort(a));
	}

}
