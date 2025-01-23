interface printable{
    void print();
}
class Document implements printable{
    public void print(){
        System.out.println("printing document...");
    }
}
class photo implements printable{
    public void print(){
        System.out.println("printing photo...");
    }
}
class InterfaceExample {
    public static void main(String args[]){
        Document d = new Document();
        photo p = new photo();
        p.print();
        d.print();
    }
}
