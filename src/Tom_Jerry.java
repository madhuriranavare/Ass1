import java.util.Scanner;

public class Tom_Jerry {
    public static void main(String[] args){
        int num;
        System.out.println("Enter num");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num%2==0 && num>=20 && num<=30){
            System.out.println("TOM");
        }
        else if(num%2!=0 && num>=20 && num<=30){
            System.out.println("Jerry");
        }
        else{
            System.out.println("No Cases Found");
        }
    }
}
