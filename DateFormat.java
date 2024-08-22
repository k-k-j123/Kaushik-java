import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormat{
	public static void main(String args[]){
		Date today=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
		String date=df.format(today);
		System.out.println("\nCurrent Date is:"+date);

		//another example
		df=new SimpleDateFormat("MM-dd-yyyy");
		date=df.format(today);
		System.out.println("\nCurrent date is:"+date);

		//formating date with time info
		df= new SimpleDateFormat("EEEEE d MM yyyy");
		date=df.format(today);
		System.out.println("\nCurrent Date is: "+date);

		//if you print date you will get unformatted output
		System.out.println("\nCurrent date and time is: "+today);

		//formatting date with time info
		df=new SimpleDateFormat("dd/MM/yy HH:mm:ss a z");
		date=df.format(today);
		System.out.println("\nCurrent date and time is: "+date);

		//date with timezone info
		df=new SimpleDateFormat("HH:mm:SS");
		date=df.format(today);
		System.out.println("\ncurrent time is: "+date);	
		df=new SimpleDateFormat("w");
		date=df.format(today);
		System.out.println("\nCurrent week of year is: "+date);
		df=new SimpleDateFormat("W");
		date=df.format(today);
		System.out.println("\nCurrent week of month is: "+date);
		df=new SimpleDateFormat("D");
		date=df.format(today);
		System.out.println("\nCurrnet Day of the year is: "+date);	
		df=new SimpleDateFormat("d");
		date=df.format(today);
		System.out.println("\nCurrnet Day of the month is: "+date);
		
	}
}
