import java.util.*;
class Clock
{
	int hr,min,sec;
	public Clock (int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	public boolean checktime()
	{
		boolean hflag,mflag,sflag;
		if(hr>=0 && hr<24)
			hflag=true;
		else 
			hflag=false;
		if(min>=0 && min<60)
			mflag=true;
		else 
			mflag=false;
		if(sec>=0 && sec<24)
			sflag=true;
		else 
			sflag=false;
		if(hflag && mflag && sflag)
			return true;
		else
			return false;
	}
	public void setAMPM()
	{
		if(hr>=0 && hr<12)
			System.out.println("Time  ="+hr+":"+min+":"+sec+"AM");	
		else 
			System.out.println("Time  ="+hr+":"+min+":"+sec+"PM");	
	}
}
public class slip9
{
	public static void main(String args[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Hourss ,Mintues and Seconds");
		int hh=s.nextInt();
		int mm=s.nextInt();
		int ss=s.nextInt();
			Clock c=new Clock(hh,mm,ss);
		if((c.checktime())==true)
			c.setAMPM();
		else
			System.out.println("Invalid Time");
		s.close();
	}
}

