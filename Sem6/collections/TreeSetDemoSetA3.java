import java.util.*;
class TreeSetDemoSetA3{
	public static void main(String args[]){
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("blue");
		ts.add("red");
		ts.add("green");
		ts.add("blue");
		ts.add("yelow");
		ts.add("cyan");
		System.out.println("The contents of set are:"+ts);
	}
}

