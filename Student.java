class Student{
	int rno;
	String name;
	static String classTeacher;
	
	Student(int r,String n){
		rno=r;
		name=n;
	}
	static void assignTeacher(String name){
		classTeacher =name;
	}
	public String toString(){
		return "["+rno+","+name+","+classTeacher+"]";
	}
	public static void main(String args[]){
		Student s1=new Student(1,"a");
		Student s2=new Student(2,"b");
		Student.assignTeacher("ABC");
		System.out.println(s1);
		System.out.println(s2);
	}
}

