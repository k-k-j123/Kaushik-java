import java.util.Scanner;
import java.io.*;
class FileCopy{
	public static void main(String args[])throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Source file name");
		String in=sc.next();
		System.out.println("Enter destination file name");
		String out=sc.next();

		FileReader fin=new FileReader(in);
		FileWriter fout=new FileWriter(out);
		int c;
		while((c=fin.read())!=-1){
			fout.write((char)c);
		}
		fout.write("\nEnd of file");
		fin.close();
		fout.close();
		sc.close();
	}
}
