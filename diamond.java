import java.util.*;
public class diamond{
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
            for(int row=0;row<2*n;row++){
            int totcol = row>n ? 2*n-row : row;
            int space = n-totcol;
            for(int i=0;i<space;i++){
                System.out.print(" ");
            }
            for(int j=0;j<totcol;j++){
            System.out.print(" *");
            }
            System.out.println();
}
}
}