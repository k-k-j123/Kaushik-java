import java.util.Scanner;
class CricketPlayer{
	String name;
	int no_of_innings;
	int no_of_times_notout;
	int totalruns;
	float bat_avg;
	
	CricketPlayer(String name,int no_of_innings,int no_of_times_notout,int totalruns,float avg){
		this.name=name;
		this.no_of_innings=no_of_innings;
		this.no_of_times_notout=no_of_times_notout;
		this.bat_avg=avg;
	}

	public static float avg(int i,int r){
			return (float)i/r;
	}

	public static void sortPlayer(CricketPlayer c[]){
		int n=c.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(c[i].bat_avg<c[j].bat_avg){
					String temp=c[i].name;
					int in=c[i].no_of_innings;
					int o=c[i].no_of_times_notout;
					int t=c[i].totalruns;
					float a=c[i].bat_avg;

					c[i].name=c[j].name;
					c[i].no_of_innings=c[j].no_of_innings;
					c[i].no_of_times_notout=c[j].no_of_times_notout;
					c[i].totalruns=c[j].totalruns;
					c[i].bat_avg=c[j].bat_avg;
					
					c[j].name=temp;
					c[j].no_of_innings=in;
					c[j].no_of_times_notout=o;
					c[j].totalruns=t;
					c[j].bat_avg=a;
				}
			}
		}
	}
	
	public static void p(String s){
		System.out.println(s);
	}

	void print(){
		p("Name="+name);
		p("No of Innings="+no_of_innings);
		p("No of Not Out="+no_of_times_notout);
		p("total runs="+totalruns);
		p("average="+bat_avg);
		p("____________________");
	}
}

class Cricket{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n=sc.nextInt();
		CricketPlayer[] c=new CricketPlayer[n];
		for(int i=0;i<n;i++){
			System.out.println("enter name");
			String s=sc.next();
			System.out.println("enter no of Innings");
			int in=sc.nextInt();
			System.out.println("Enter no of times notout");
			int no=sc.nextInt();
			System.out.println("enter total runs");
			int r=sc.nextInt();
			float a=CricketPlayer.avg(in,r);
			c[i]=new CricketPlayer(s, in, no, r, a);
		}
		System.out.println("\ndetails of players\n");
		for(int i=0;i<n;i++){
			c[i].print();
		}
		sc.close();
	}
}





		
