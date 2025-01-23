import java.io.*;
import java.util.Scanner;
class fileCount{
	public static void main(String args[])throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String fname=sc.next();
		int wc=0,lc=0,cc=0;
		String buff;
		File f=new File(fname);
		Scanner fr=new Scanner(f);
		while(fr.hasNextLine()){
			buff=fr.nextLine();
			lc++;
			cc+=buff.length();
			String words[]=buff.split("\\s+");
			wc+=words.length;
		}
		System.out.println("Number of words:"+wc);
		System.out.println("Number of lines:"+lc);
		System.out.println("Number of characters:"+cc);
		fr.close();
		sc.close();
	}
}
			

