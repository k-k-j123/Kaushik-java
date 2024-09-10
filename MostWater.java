import java.util.ArrayList;
class MostWater{
	public static int storeWater(ArrayList<Integer> height){
		int max=0;
		int lp=0;
		int rp=height.size()-1;
		while(lp<rp){
			int ht=Math.min(height.get(lp),height.get(rp));
			int widht=rp-lp;
			int currWater=ht*widht;
			max=Math.max(max, currWater);

			if(height.get(lp)<height.get(rp)){
				lp++;
			}else{
				rp--;
			}
		}

		return max;
	}

	public static void main(String args[]){
		ArrayList<Integer> height=new ArrayList<>();
		for(int i=0;i<args.length;i++){
			height.add(Integer.parseInt(args[i]));
		}
		System.out.println("most water stored is "+storeWater(height));
	}
}

