
import java.util.Scanner;


public class circle {
    public static void cir(){
        System.out.println("Enter The Cut Parts:");
        Scanner sc = new Scanner(System.in);
        int cp =sc.nextInt();
        if(cp%2 == 0){
            int cut =cp/2;
            System.out.println(cut);
        }
        if(cp%2==1){
            int cut = cp;
            System.out.println(cut);
        }
    }
    public static void main(String[] args) {
        cir();
    }
}
