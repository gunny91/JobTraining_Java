package pkg11;

import java.util.Calendar;

public class MyCalendar {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		int amPm = calendar.get(Calendar.AM_PM);
		String samPm = amPm ==1? "PM" :"AM";
		int hour =calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		String temp = "Now "+year +" year "+month+"Month "+  day+"Day";
		temp += samPm+" "+hour+"hour"+ minute+"min"+ second + "sec";
		System.out.println(temp);

	}

}
