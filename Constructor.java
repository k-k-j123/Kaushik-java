public class Constructor{
	private int no;
	Constructor(){
		no=5;
	}//default constructor
	Constructor(int no){
		this.no=no;
	}//parametrized constructor
	public void isNegaive(){
		if(no<0){
			System.out.println("Given number is negative");
		}
	}
	public void isPositive(){
		if(no>0){
			System.out.println("Given number is Positive");
		}
	}
	public void isZero(){
		if(no==0){
			System.out.println("Given number is zero");
		}
	}
	public void isOdd(){
		if(no%2!=0){
			System.out.println("Given number is odd");
		}
	}
	public void isEven(){
		if(no%2==0){
			System.out.println("Given number is even");
		}
	}
	public static void main(String args[]){
		Constructor n1=new Constructor();
		System.out.println(n1.no+ " Details");
		n1.isNegaive();
		n1.isPositive();
		n1.isZero();
		n1.isOdd();
		n1.isEven();
		int n=Integer.parseInt(args[0]);
		Constructor n2=new Constructor(n);
		System.out.println(n2.no+" Details");
		n2.isNegaive();
		n2.isPositive();
		n2.isZero();
		n2.isOdd();
		n2.isEven();
	}

}
