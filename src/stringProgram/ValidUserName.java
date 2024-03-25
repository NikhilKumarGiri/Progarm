package stringProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserName {
	static boolean valid(String s) {
		String regex="^[a-zA-Z0-9_$]{8,20}";
		Pattern p=Pattern.compile(regex);
		if(s.length()>=0)
		{
			Matcher m=p.matcher(s);
			return m.matches();
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(valid("$fad_rs1$345678u975e"));
	}
}
