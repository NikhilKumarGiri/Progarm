package stringProgram;

public class Test {
	static boolean test(String s)
	{
		int firstB=s.indexOf('b');
		if(firstB==-1) {
			return true;
		}
		boolean hasA=s.substring(firstB).contains("a");
		return !hasA;
	}

	public static void main(String[] args) {
		System.out.println(test("aaabbbsnns"));
		
		System.out.println(test("bbbaaaa"));
	}
	}


