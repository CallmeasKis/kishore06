
import java.util.Scanner;
public class elseif{
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number between 20");
        n=sc.nextInt();
        if(n==2||n==3||n==5||n==7||n==11||n==13||n==17||n==19)
        {
            System.err.println("prime number");
        }
        else if(n%2==0||n%3==0||n%5==0||n%7==0||n%11==0||n%13==0||n%17==0||n%19==0){
            System.err.println("not a prime number");
        }
        else{
            System.out.println("prime number");

        }

    }
}