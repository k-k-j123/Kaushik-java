import java.util.*;
class slip3_2 {
    public static void main(String args[]){
        LinkedList<String> lt=new LinkedList<>();
        lt.add("apple");
        lt.add("ball");
        lt.add("cat");
        System.out.println(lt);
        lt.addFirst("nullval");
        System.out.println(lt);
        lt.removeFirst();
        System.out.println(lt);
        ListIterator<String> it=lt.listIterator(lt.size());
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }   
}
