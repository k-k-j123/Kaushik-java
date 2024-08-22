public class Multi_arr{
	public static void main(String args[]){
		int arr[][]={{11,22,33},{44,55,66},{77,88,99}};
		for(int value[]:arr){
			for(int ivalue:value)
				System.out.println(ivalue+" ");
			System.out.println();
		}
		// for(int i=0;i<3;i++){
		// 	for(int j=0;j<3;j++){
		// 		System.out.println(arr[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }
	}
}