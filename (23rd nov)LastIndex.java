public class LastIndex {
public static void lastIndex(int[] a) {
	int index=-1;
	boolean flag=false;
	for(int i=0;i<a.length;i++) {
		System.out.println(i);
		if(a[i]==15) {
			flag=true;
			index=i;
		}
		System.out.println(flag);
	}
	System.out.println(index);
}
	
	public static void main(String[] args) {
		try {
			int[]arr= {12,123,34,15,51,15,18,19,10,15};
			for (int i = 0; i < arr.length; i++) {
				lastIndex(arr);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}