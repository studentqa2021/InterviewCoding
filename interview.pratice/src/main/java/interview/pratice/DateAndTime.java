package interview.pratice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		
		Date date =new Date();
		
		System.out.println(date);
		SimpleDateFormat sdf =new SimpleDateFormat("mm/dd/yyyy  hh.mm.ss a");
		System.out.println(sdf.format(date));
	}

}
