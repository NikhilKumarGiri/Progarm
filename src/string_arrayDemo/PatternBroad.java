package string_arrayDemo;

public class PatternBroad {
	public static void main(String[] args) {
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i%2==0?"2 ":"1 ");
			}System.out.println("");
			
		}
	}
}
