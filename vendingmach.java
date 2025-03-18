
import java.util.Scanner;

public class vendingmach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int d=sc.nextInt();
        int up=sc.nextInt();
        int lp=sc.nextInt();
        int final_price=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
        int deg=sc.nextInt();
        int price=sc.nextInt();
        deg=(deg<k)?(deg+d):(deg-d);
        deg=(deg>k)?k:deg;
        
        }
}
}
