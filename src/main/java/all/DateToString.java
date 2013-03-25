package all;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	
	public static void main(String[] args) {

		 Date d=new Date();
		System.out.println(d);
		SimpleDateFormat dateFormat=new SimpleDateFormat(" MMMM/dd/yyyy");//Year and Date should me small letters like dd and yyyy month should be capital
		System.out.println(dateFormat);
		String string_date=dateFormat.format(d);
		System.out.println("String date is :"+ string_date);
	 
	}

}
