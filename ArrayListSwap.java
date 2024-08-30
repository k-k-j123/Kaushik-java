import java.util.ArrayList;
class ArrayListSwap{
	public static void swap(ArrayList<Integer> list,int i1,int i2){
		int temp=list.get(i1);
		list.set(i1,list.get(i2));
		list.set(i2,temp);
	}
	public static void main(String args[]){
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<args.length;i++){
			list.add(Integer.parseInt(args[i]));
		}
		System.out.println("Before swapping list is: "+list);
		swap(list,4,2);
		System.out.println("After swapping list is: "+list);
	}
}

