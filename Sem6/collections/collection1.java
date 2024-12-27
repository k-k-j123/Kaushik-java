import java.util.*;
public class collection1{
	public static void main(String args[]){
		LinkedList t= new LinkedList();
		t.add("red");
		t.add("blue");
		t.add("yellow");
		t.add("orange");
		Iterator i = t.iterator();
		System.out.println("The Elements are");
		while(i.hasNext())
			System.out.println(i.next());
		ListIterator il= t.listIterator();
		while(il.hasNext())
			il.next();
		System.out.println("the elements in reverse order");
		while(il.hasPrevious())
			System.out.println(il.previous());
		LinkedList t2=new LinkedList();
		t2.add("pink");
		t2.add("green");
		t.addAll(2,t2);
		Iterator i2= t.iterator();
		System.out.println("Total elements are");
		while(i2.hasNext())
			System.out.println(i2.next());
	}
}

