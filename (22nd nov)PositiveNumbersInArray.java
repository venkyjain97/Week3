public class PositiveNumbersInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int []a=new int[10];
			int i;
			boolean flag=false;
			for( i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
				System.out.println(i);
				}
			for ( i = 0; i < a.length; i++) {
				System.out.println(i);
				if(a[i]>0) {
					flag=true;
				}else{
					System.out.println("negative number found checking breaks");
					break;
				}
				System.out.println(flag);
				System.out.println("all positve elements in array is "+a[i]+" at index "+i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}