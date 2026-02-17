
import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAPIDemo {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("The current date is : "+date);
	
		
		LocalTime time = LocalTime.now();
		System.out.println("The current date is : "+time);
		
		// it will give the current time and date
		LocalDateTime current = LocalDateTime.now();
		System.out.println("The current date is : "+current);
	
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYY HH:mm:ss");
		String formattedDateTime = current.format(format);
		System.out.println("Formatted Date :" + formattedDateTime);
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month : "+month + "  Day : "+ day + "  Seconds :"+seconds);
		
		// printing date with current time
		LocalDate date2 = LocalDate.of(1950, 1, 26);
		System.out.println("The republic day : "+date2);
		LocalDateTime specificDate = current.withDayOfMonth(14).withYear(2028);
		
		System.out.println("Specific date with "+"current time : "+ specificDate);
	}
}
