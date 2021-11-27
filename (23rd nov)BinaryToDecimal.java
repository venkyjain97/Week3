public class BinaryToDecimal {
    public static int BinaryToDecimal(int num) {
        int temp=num;
        int pow_Of_Two=0;
        while(temp>0) {
            int remender=temp%10;
            temp=temp/10;
            deciNum=deciNum+remender*(int)Math.pow(2,pow_Of_Two++);
        }
        return(deci_Num);
    }
    static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int display=binary_To_Decimal(n);
    System.out.println("Decimal equivalent of binary "+n+" is "+display);
        }
    }