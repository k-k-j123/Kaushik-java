import java.util.ArrayList;
class ArrayListReverse{
	public static void main(String args[]){
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<args.length;i++){
			list.add(Integer.parseInt(args[i]));
		}
		System.out.println(list);

		System.out.println("Array list in reverse is:");
		for(int i=list.size()-1;i>=0;i--){
			System.out.print(list.get(i)+" ");
		}

	}
}
