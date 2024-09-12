import java.util.*;
class Account{
    String cname;
    int ano;
    Account(int ano,String cname){
        this.ano=ano;
        this.cname=cname;
    }

    void display(){
        System.out.println("Customer Name: "+cname+"\nAccount no: "+ano);
    }
}
class SavingsAccount extends Account{
    int savingbal,minbal;
    SavingsAccount(int ano,String cname,int savingbal,int minbal){
        super(ano,cname);
        this.savingbal=savingbal;
        this.minbal=minbal;
    }
    void display(){
        super.display();
        System.out.println("Saving bal: "+savingbal+"\nMinimum bal: "+minbal);
    }
}
class AccountDetail extends SavingsAccount{
    int depositamt,withdrawlamtl;
    AccountDetail(int ano,String cname,int savingbal,int minbal,int depositamt,int withdrawlamtl){
        super(ano,cname,savingbal,minbal);
        this.depositamt=depositamt;
        this.withdrawlamtl=withdrawlamtl;
    }
    void display(){
        super.display();
        System.out.println("Deposit amt: "+depositamt+"\nwithdrawl amt: "+withdrawlamtl);
    }
}
class Slip15_2{
    public static void main(String args[]){
        AccountDetail acc=new AccountDetail(101,"abc",20000,1000,2000,5000);
        acc.display();
    }
}
