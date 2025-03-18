import java.util.*;
class numsys{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        
        System.out.println(EqualNumber(a,b,c));
    }
    static int EqualNumber(int a,int b,int c){
        int count=0;
        int mainmax=Math.max(Math.max(a,b),c);
        int temp=mainmax;
        while(!(a==b && a==c && b==c)){
            int max=Math.max(Math.max(a,b),c);
            int min=Math.min(Math.min(a,b),c);
            int middle=(a+c+b)-(max+min);
            a=max-1;
            b=min+1;
            c=middle+1;
            
            count++;
            if(max>temp){
                return -1;
            }
        }
        return count;
    }
}