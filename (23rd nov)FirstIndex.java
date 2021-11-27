import java.util.Scanner;
public class FirstIndex {
	public static void index(int[]a) {
	boolean flag=false;
	int index=-1;
	for (int i = 0; i < a.length; i++) {
		System.out.println("Checking at index "+i);
		if(a[i]==15) {
			index=i;
			flag=true;
			break;
		}
		System.out.println(flag);	
	}
	System.out.println("The first index at which element is present in array is "+index);
	}
    	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		try {
			int[]arr= {12,123,34,15,51,15,18,19,10,15};
			for (int i = 0; i < arr.length; i++) {
				index(arr);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}