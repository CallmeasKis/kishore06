public class isori {

        public static void main(String[] args) {
            int n=25;
            int b = (int)Math.log10(n)+1;
            int sum=0;
            int temp =n;
            while(n>0){
                sum+=(int)Math.pow(n%10,b);
                --b;
                n=n/10;
            }
            if(temp==sum) System.out.println("Is Orium");
            else System.out.println("Not a Orium");
        }
    }
    
