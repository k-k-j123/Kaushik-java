import java.util.ArrayList;
class ArrayListMaximum{
	public static void main(String args[]){
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<args.length;i++){
			list.add(Integer.parseInt(args[i]));
		}
		System.out.println("Your list is: "+list);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++){
			if(max<list.get(i)){
				max=list.get(i);
			}
		}
		System.out.println("Maximum of list is: "+max);
	}
}
