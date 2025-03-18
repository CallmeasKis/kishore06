
import java.util.Scanner;



public class nestedwhile{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n>0) {
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            System.out.println(sum);
            if(sum<10)
                break;
            else
            n=sum;
        }
    }
}