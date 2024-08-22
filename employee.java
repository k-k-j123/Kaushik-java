class Employee{
	int empid,salary;
	String name,dept;
	static int cnt=0;
	public Employee(){
		cnt++;
	}
	public Employee(int empid,String name,String dept,int salary){
		this.empid=empid;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		cnt++;
	}
	public String toString(){//returns the information of an object
		return "empid: "+empid+" Name: "+name+" Dept: "+dept+" Salary: "+salary;
	}
}
class employee{
	public static void main(String args[]){
		
		Employee e1=new Employee(1,"AAA","Computer",20000);
		System.out.println("No of objects="+Employee.cnt);
		System.out.println(e1);
		Employee e2=new Employee(2,"BBB","Science",15000);
		System.out.println("No of objects="+Employee.cnt);
		System.out.println(e2);
		Employee e3=new Employee(3,"CCC","MAths",10000);
		System.out.println("No of objects="+Employee.cnt);
		System.out.println(e3);
		Employee e4=new Employee(4,"DDD","Geology",11000);
		System.out.println("No of objects="+Employee.cnt);
		System.out.println(e4);

	}
}