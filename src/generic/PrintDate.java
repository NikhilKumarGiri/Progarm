package generic;

import java.util.Date;

public class PrintDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));

	}

}
