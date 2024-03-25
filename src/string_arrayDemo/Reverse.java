package string_arrayDemo;

public class Reverse {
	public static void main(String[] args) {
    String s="abv";
    StringBuffer bf=new StringBuffer(s).reverse();
    System.out.println(bf);
    String d=bf.substring(0,1).toUpperCase()+bf.substring(1);
	//System.out.println(d);
	String rev="";
	for(int i=0;i<d.length();i++)
	{
		rev=rev+d.charAt(i)+" ";
	}	System.out.println(rev);	

	}
}
