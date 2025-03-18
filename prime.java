
public class prime{
    public static void main(String[] args) {
        int n=81;
        int sq=(int)Math.sqrt(n);
        boolean flag=false;
        for(int i=2;i<=sq;i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(flag==true)
         System.out.println("No");
        else 
        System.out.println("Yes");
    }
}