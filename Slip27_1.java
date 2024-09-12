class Employee{
    String name;
    double salary;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}
class Manager extends Employee{
    double ta,ha;
    public Manager(String name,double salary,double ta,double ha){
        super(name,salary);
        this.ta=ta;
        this.ha=ha;
    }
    @Override
    public double getSalary(){
        return super.getSalary()+ta+ha;
    }
}
public class Slip27_1{
    public static void main(String args[]){
        Employee e1=new Employee("Aarya",5000.0);
        System.out.println("Employee name: "+e1.name+"\nSalary: "+e1.getSalary());
        Manager m=new Manager("Kaushik",8000.0,1000.0,2000.0);
        System.out.println("Manager name: "+m.name+"\nSalary: "+m.getSalary());
    }
}
