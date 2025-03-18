import java.util.Scanner;
class employee{
    void employee(){
        System.out.println("Showed Employee Details:");
    }
 
}
public class kis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Of Employee:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Employee:"+i);
            System.out.print("Enter Employee ID:");
            int id=sc.nextInt();
            System.out.print("Enter Employee salary:");
            int salary =sc.nextInt();
            System.out.print("Enter Employee Name:");
            String name =sc.next();
            System.out.print("Enter Employee Experience:");
            int ex_yrs =sc.nextInt();
        }
        employee obj = new employee();
        obj.employee();
    }
}
