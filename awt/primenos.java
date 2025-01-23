class slip1_1 {
    public static boolean is_prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int l = args.length;
		int arr[] = new int[l];

		for (int i = 0; i < l; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}

		System.out.println("Prime numbers in the array are:");
		for (int i = 0; i < l; i++) {
			if (is_prime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
}

