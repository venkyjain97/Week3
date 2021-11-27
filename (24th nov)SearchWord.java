import java.util.Scanner;
public class WordInsideString {
	public static void search_A_Word(String str) {
		int index=str.indexOf("Hello");
		if(index==-1) {
			System.out.println("Word not found");
		}
		else {
			System.out.println("Word is found");
		}
	}
	public static void main(String[] args) {
		String s="Search Word";
		search_A_Word(s);
	}
}