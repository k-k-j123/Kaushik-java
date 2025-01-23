class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        System.out.println("age is invalid");
    }
}
class tryCatch {
    public static void main(String args[]){
        try{
            int age=Integer.parseInt(args[0]);
            if(age<0){
                throw new InvalidAgeException();
            }
            System.out.println("correct age");
        }catch (InvalidAgeException e){
            System.out.println("enter valid age");
        }
        finally{
            System.out.println("Program terminated");
        }

    }
}
