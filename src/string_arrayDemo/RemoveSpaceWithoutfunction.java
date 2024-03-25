package string_arrayDemo;

public class RemoveSpaceWithoutfunction {
	public static void main(String[] args) {
		String a="    aafa 	gan laui   ";
		String b=a.replaceAll("[\\s]", "");
		String afterremove=""; 
		for (int i = 0; i < a.length(); i++) {
			if((a.charAt(i)!=' ') && (a.charAt(i)!='\t'))
					{
				afterremove=afterremove+a.charAt(i);
					}
		}System.out.println(afterremove);
		System.out.println(b);
	}
}
