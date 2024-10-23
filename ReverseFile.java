import java.io.*;
class ReverseFile{
	public static void main(String args[]) throws Exception{
		FileReader fr=new FileReader("sample.txt");
		BufferedReader br=new BufferedReader(fr);
		String s,s1="";
		while((s=br.readLine())!=null){
			s1=s+"\n";
		}
		System.out.println(s1);
		System.out.println("***********File Content in reverse************");
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.reverse());
		System.out.println("***********File content in Upper**************");
		System.out.println(s1.toUpperCase());
		fr.close();
	}
}

