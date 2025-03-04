
import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter mark");
     int mark = sc.nextInt();
     if(mark>=50){
        System.out.println("pass");
     }
         if(mark>=80){
            System.out.println("grade A");
     }
    }
}
