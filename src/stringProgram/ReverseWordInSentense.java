package stringProgram;

public class ReverseWordInSentense {
	// my name Input
	// eman ym ouput
	public  void Reverseword(String s) {
		String[] words = s.split(" ");
		
		String output="";
		for (String word : words) {
			String revword = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revword = revword + word.charAt(i);
			}
			output=output+revword+ " ";
			
		}
		System.out.println(output);//return output;
	}
	public static void main (String args[])
	{
		//System.out.println(ReverseWordInSentense.Reverseword("my is morgan"));
		ReverseWordInSentense a=new ReverseWordInSentense();
		a.Reverseword("my name");

	}
}
