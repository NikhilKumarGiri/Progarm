package stringProgram;

public class InsertString {
	static String insertString(String original,int indexno,String toBeInserted)
	{
		String firstststring=original.substring(0, indexno+1);
		String finalstring=firstststring+" "+toBeInserted+" " +original.substring(indexno+1);
		//System.out.println(finalstring);
		return finalstring;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(insertString("INikhil", 0, "am"));
	}

}
