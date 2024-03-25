package generic;

public class Ptaag {

	public static void main(String[] args) {
		String s="Nikhil kaumar Giri";
		
		String word[]=s.split(" ");
		for(String b:word)
		{
			char c=Character.toUpperCase(b.charAt(0));
			//v=b.substring(0,1).toUpperCase();
			System.out.print(c+".");

			}
	}

}
