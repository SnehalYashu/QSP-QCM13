package ScreenShot;

import java.time.LocalDateTime;
import java.util.Date;

public class GetSystemTimeandDate {

	public static void main(String[] args) {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		System.out.println(timestamp);
		//another way of using to get the date and time
		 Date date = new Date();
		 System.out.println(date.toString());
	}    

}
