import java.util.Scanner;
public class SumOfAllElementsInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	try {
		int[]a=new int[10];
		int sum=0;
		for ( int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			System.out.println(i);
			sum=sum+a[i];
		}
		System.out.println(sum);	
	} 
    catch (Exception e) {
		System.out.println(e);
	}			
   }
  }