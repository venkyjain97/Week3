import java.util.Scanner;
public class MiddleElementInArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int []a=new int[10];
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
				System.out.println(i);
				System.out.println(i);
				if(i==5) {
					System.out.println(a[i]);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	  }
    }