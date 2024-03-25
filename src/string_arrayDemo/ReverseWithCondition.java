package string_arrayDemo;
//input -Abcd
//output- D c b a
public class ReverseWithCondition {
	public static String reverse(String s) {

		String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i) + " ";
        }
        char first = rev.charAt(0);
        char fir = Character.toUpperCase(first);// D
      //  System.out.print(fir);

        char last = rev.charAt(rev.length()-2);
        char las = Character.toLowerCase(last);// a

        String f = rev.substring(1, rev.length() - 2);
        return fir + f + las; // D+cb+a
    }

		//return ((rev.substring(1)).toUpperCase()+rev.substring(1, rev.length()-2)+rev.substring(rev.length()-2).toLowerCase());

	public static void main(String args[]) {
		System.out.println(reverse("Abcd"));

	}
}
