package pkg12;

import java.util.Calendar;

public class UserCalendar {

	public UserCalendar() {
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM);
		String isAmPm =ampm==0? "A.M.":"P.M.";
		
		String temp = "Current time : "+ isAmPm + " "+ hour + ": "+ minute +": "+sec ;
		
		System.out.println(temp);
	}
}
