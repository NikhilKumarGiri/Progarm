 package stringProgram;

import java.util.regex.Pattern;

public class RegularEcxpression {
	public static void main(String[] args) {
		//.. Indicate any 2 char ,and after that g
		//2nd input in char sequence
		System.out.println(Pattern.matches("..g","dsg"));//true
		
		//[sde] all the char compare with the 2nd char,
		//if a single char of 1st string is present then true
		System.out.println(Pattern.matches("[sde]", "s"));//true
		System.out.println(Pattern.matches("[sde]", "d"));//true
		System.out.println(Pattern.matches("[sde]", "sd"));//false
		
		//any char from sde ,should not present in 2nd char
		System.out.println(Pattern.matches("[^sde]", "i"));//true
		System.out.println(Pattern.matches("[^sde]", "sd"));//false
		
		//2nd string should present between a-z and A-S
		System.out.println(Pattern.matches("[a-zA-S]", "T"));//false
		//Pattern.compile(null);
		
		//M or S,after a-z then a-z should be 6 length
		System.out.println(Pattern.matches("[MS][a-z]{6}", "Monicas"));//true
		System.out.println(Pattern.matches("[MS][a-z]{6}", "Soicais"));//true

		//remove char from string op -int
		String d ="das123ret";
		System.out.println(d.replaceAll("[^\\d]", ""));
		//a-zA-Z0-9 having 6 length
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Sarf43"));//true
		String s="[0-9][0-9]";
		String st="56";
		if(Pattern.matches(s, st));
		{
			System.out.println("hgyt");
		}

	}}
