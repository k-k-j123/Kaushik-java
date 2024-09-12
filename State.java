import java.io.*;
class Continent{
    String con;
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    void con_input() throws IOException{
        System.out.println("Enter Continent name:");
        con=r.readLine();
    }
}
class Country extends Continent{
    String cou;
    void cou_input() throws IOException
    {
        System.out.println("Enter Country Name: ");
        cou=r.readLine();
    }
}
class State extends Country{
    String sta,place;
    void sta_input() throws IOException{
        System.out.println("Enter State name: ");
        sta=r.readLine();
        System.out.println("Enter place name: ");
        place=r.readLine();
    }

    public static void main(String args[]) throws IOException{
        State s=new State();
        s.con_input();
        s.cou_input();
        s.sta_input();
        System.out.println("\n\nContinent: "+s.con);
        System.out.println("Country: "+s.cou);
        System.out.println("State: "+s.sta);
        System.out.println("Place: "+s.place);
    }
}
