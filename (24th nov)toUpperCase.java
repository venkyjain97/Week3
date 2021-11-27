import java.util.Scanner;
public class toUpperCase {
	public static String first_Char(String str) {
		str=" "+str;
		String rst="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				rst=rst+ch;
				i++;
				ch=str.charAt(i);
				rst=rst+Character.toUpperCase(ch);
			}else {
				rst=rst+ch;
			}
		}
		rst=rst.trim();
		return(rst);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String display=first_Char(s);
		System.out.println("First char of a word is: "+display);
	}
}