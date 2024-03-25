package string_arrayDemo;

public class CheckSubstringPresence {
	public static boolean ispresent(String main,String sub)
	{
		return main.matches("(.*)"+sub+"(.*)");
	}
	//method 2
	static boolean ispresent1(String main,String sub)
	{
		return main.contains(sub);
	}
	public static void main(String[] args) {
		System.out.println(ispresent("my name nikhil is", "is"));
		System.out.println(ispresent1("my name nikhil is", " "));

	}
}
