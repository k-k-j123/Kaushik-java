import java.util.Collections;
import java.util.ArrayList;
class ArrayListSort{	
	public static void main(String args[]){
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<args.length;i++){
			list.add(Integer.parseInt(args[i]));
		}
		System.out.println("Before sorting list is: "+list);
		Collections.sort(list);//for descending oreder it is Collections.sort(list,Collections.reverseOrder());
		System.out.println("After sorting list is: "+list);
	}
}
