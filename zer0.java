import java.util.*;
public class zer0{
    public static void main(String[] args){
    int n;
    Scanner kis = new Scanner(System.in);
    System.out.println("enter number");
    n =kis.nextInt();
    int r,c=0;
    while(n>0){
        r=n%10;
        if(r==0){
            System.err.println("zero present");
            c++;break;
        }
            n=n/10;     
    }
    if(c==0)
        System.out.println("No zero present");
}
}
    

