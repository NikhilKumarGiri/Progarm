package integer;

public class RemoveIntfromString {
	public static void main(String[] args) {
		String s="12wqrayq132";
		String b=s.replaceAll("[\\D]","");
		//int f=Integer.parseInt(b);
		System.out.println(b);
	}

}
