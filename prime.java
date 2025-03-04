
import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        if(n==2||n==3||n==5||n==7)
        {
            System.err.println("prime number");
        }
        else if(n%2==0||n%3==0||n%5==0||n%7==0){
            System.err.println("not a prime number");
        }
        else{
            System.out.println("prime number");

        }

    }
}