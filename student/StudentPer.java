package student;
public class StudentPer
{
	public double calcper(int[] mar)
	{
		double per;
		int sum=0;
		for(int i=0;i<6;i++)
			sum+=mar[i];
		per=(double)sum/6;
		return per;	
	}
}

