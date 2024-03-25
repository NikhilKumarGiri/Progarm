package string_arrayDemo;

public class Word_Caps_From_Sentences {
	private static String convert_Caps(String sent)
	{
		//null check should be in the begin
		if(sent==null)
		{
			System.out.println("Null is not allowed");
			return null;
	      //  throw new NullPointerException("Null is not allowed");

		}
		if(sent.length()==1)
		{
			return sent.toUpperCase();
		}
		
		String s[]=sent.split(" ");
		String finals="";
		for(String word:s)//for(int i=0;i<s.length;i++){instead of word use s[]}
		{
			String first=word.substring(0, 1).toUpperCase();//i-I
			String remain=word.substring(1);//after I store remaining value
			finals=finals+first+remain+" ";
		}
		//finals.replaceAll("\\s", "");
		System.out.println(finals);
		//remove extra space from 1st and last
		finals=finals.trim();
		return finals;
	}

	public static void main(String[] args) {
		convert_Caps("nikhil kumar giri");
		String cap=convert_Caps("n");
		System.out.println(cap);
		//convert_Caps("n");		
		convert_Caps("n n n n ");
		//convert_Caps(null);
	}

}
