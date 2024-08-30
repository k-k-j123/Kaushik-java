import java.util.ArrayList;
class ArrayListExample{
	public static void main(String args[]){
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<args.length;i++){
			list.add(i);
		}
		System.out.println(list);

		list.remove(2);
		System.out.println(list);

		list.add(2,4);
		System.out.println(list);

		list.set(3,5);
		System.out.println(list);

	}
}

