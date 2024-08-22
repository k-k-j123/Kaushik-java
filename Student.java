import java.io.*;
class Student{
	private int rollno;
	private String sname;
	private float per;
	private static int cnt=0;
	
	public Student(int r,String n,float p){
		rollno=r;
		sname=n;
		per=p;
		cnt++;
	}

	public String toString(){
		return "roll no: "+rollno+" Name: "+sname+" Percentage: "+per;
	}

	public static void sort(Student s[]){
		int i,j;
		String temp;
		int t1;
		float t2;
		for(i=0;i<s.length;i++){
			for(j=i+1;j<s.length;j++){
				if(s[i].per>s[j].per){
					temp=s[i].sname;
					s[i].sname=s[j].sname;
					s[j].sname=temp;

					t1=s[i].rollno;
					s[i].rollno=s[j].rollno;
					s[j].rollno=t1;

					t2=s[i].per;
					s[i].per=s[j].per;
					s[j].per=t2;
				}
			}
		}
	}

	public static void main(String args[]) throws IOException{
		int rno=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how many Students");
		int n=Integer.parseInt(br.readLine());
		Student[] s=new Student[n];
		System.out.println("No of objects= "+Student.cnt);
		for(int i=0;i<n;i++){
			System.out.println("\nEnter the Name:");
			String sname=br.readLine();
			System.out.println("\nEnter the Percentage");
			float per=Float.parseFloat(br.readLine());
			s[i]=new Student(rno,sname,per);rno++;
		}
		System.out.println("No. of objects: "+Student.cnt);
		for(int i=0;i<n;i++){
			sort(s);
			System.out.println("\n*******SORTED DETAILS ARE*******");
			for(i=0;i<n;i++){
				System.out.println(s[i]);
			}
		}
	}
}

	


