public class DiffInTwoArrays {
public static int[] diff(int[] a,int[]b) {
	int c[]=new int[5];
	for (int i = 0; i < b.length; i++) {
		c[i]=a[i]-b[i];
	}
	return(c);
}
	public static void main(String[] args) {
			int[] a= {11,112,103,114,150};
			int[] b= {1,2,3,4,5};
			int [] rslt=new int[5];
			for(int i=0;i<rslt.length;i++) {
				rslt=diff(a, b);
				System.out.println("difference between two arrays is "+rslt[i]);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}