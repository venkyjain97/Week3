import java.util.Scanner;
public class ReverseSentence {
	public static void reverse(String str) {
		char[] arr=str.toCharArray();
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		reverse(s);
	}
}