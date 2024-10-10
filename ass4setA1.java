import java.util.Scanner;
class CovidPatient extends Exception{
	public CovidPatient()
	{
		System.out.println("Patient is Covid positive");
	}
}
class patient
{
	int patient_age,patient_oxy_level,patient_HRTC_report;
	String patient_name;

	public patient(int patient_age,String patient_name,int patient_oxy_level,int patient_HRTC_report)
	{
		try{
			this.patient_age=patient_age;
			this.patient_oxy_level=patient_oxy_level;
			this.patient_HRTC_report=patient_HRTC_report;
			this.patient_name=patient_name;

			if(patient_oxy_level<95 && patient_HRTC_report>10)
				throw new CovidPatient();
		}
		catch(CovidPatient e)
		{
		}
	}

	public String toString()
	{
		return "Patient name:"+patient_name+"\nPatient_age:"+patient_age+"\nPatient_oxy_level:"+patient_oxy_level+"\npatient_HRTC_report:"+patient_HRTC_report;
	}
}
class ass4setA1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Patient age:");
		int pid=sc.nextInt();
		System.out.println("enter patient namea:");
		String pname=sc.next();
		System.out.println("enter patienet Oxygen level:");
		int o=sc.nextInt();
		System.out.println("Enter Patient HRTC report:");
		int hrct=sc.nextInt();
		patient p=new patient(pid,pname,o,hrct);

		System.out.println(p);
	}
}
