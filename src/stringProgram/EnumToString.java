 package stringProgram;
//use to declare some set of data

//enum are constant
//enum should written in caps
//enum is a customize datatype 

public class EnumToString {
	enum Cars {
		BMW, AUDI, HONDA, TATA;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Cars.BMW.toString());
		System.out.println(Cars.AUDI.toString());
		System.out.println(Cars.HONDA.name());
		System.out.println(Cars.TATA.name());
		System.out.println("Using for loop");
		for (Cars c : Cars.values()) {
			System.out.println(c);
		}
	}

}
