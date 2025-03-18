public class amstrong {
    public static void main(String[] args) {
        int n=175;
        int b = (int)Math.log10(n)+1;
        int sum=0;
        int temp =n;
        while(n>0){
            sum+=(int)Math.pow(n%10,b);
            --b;
            n=n/10;
        }
        if(temp==sum) System.out.println("Amstrong Number");
        else System.out.println("Not A Amstrong Number");
    }
}
