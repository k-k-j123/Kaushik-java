class Bubblesort{
	public static void main(String args[]){
		int arr[]=new int[args.length];
		System.out.println("Array Before Sort");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(args[i]);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array after sort");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int t;
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}

		for(int value:arr){
			System.out.print(value+ " ");
		}
	}
}