package Java_8;
/*
Not thread safe : Unlike old java.util.Date which is not thread safe the new date-time API is immutable and doesn’t have setter methods.
Less operations : In old API there are only few date operations but the new API provides us with many date operations.
Java 8 under the package java.time introduced a new date-time API, most important classes among them are :  

Local : Simplified date-time API with no complexity of timezone handling.
Zoned : Specialized date-time API to deal with various timezones.
LocalDate/LocalTime and LocalDateTime API : Use it when time zones are NOT required.
*/

import java.time.*;
import java.time.format.DateTimeFormatter;

public class New_Date_and_Time_API {

public static void LocalDateTimeApi()
{

	// the current date
	LocalDate date = LocalDate.now();
	System.out.println("the current date is "+ date);


	// the current time
	LocalTime time = LocalTime.now();
	System.out.println("the current time is "+time);
	

	// will give us the current time and date
	LocalDateTime current = LocalDateTime.now();
	System.out.println("current date and time : "+current);


	// to print in a particular format
	DateTimeFormatter format =
	DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	String formatedDateTime = current.format(format);
	
	System.out.println("in formatted manner "+formatedDateTime);


	// printing months days and seconds
	Month month = current.getMonth();
	int day = current.getDayOfMonth();
	int seconds = current.getSecond();
	System.out.println("Month : "+month+" day : "+day+" seconds : "+seconds);

	// printing some specified date
	LocalDate date2 = LocalDate.of(1950,1,26);
	System.out.println("the republic day :"+date2);

	// printing date with current time.
	LocalDateTime specificDate =current.withDayOfMonth(24).withYear(2016);

	System.out.println("specific date with "+"current time : "+specificDate);
}

	// Driver code
	public static void main(String[] args)
	{
		LocalDateTimeApi();
	}
}

/*
o/p :
the current date is 2023-05-21
the current time is 08:15:42.691444700
current date and time : 2023-05-21T08:15:42.691444700
in formatted manner 21-05-2023 08:15:42
Month : MAY day : 21 seconds : 42
the republic day :1950-01-26
specific date with current time : 2016-05-24T08:15:42.691444700

*/








