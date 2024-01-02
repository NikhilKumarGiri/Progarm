package stringProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {
		String date="2023-11-11";
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dat=sd.parse(date);
			System.out.println(dat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
