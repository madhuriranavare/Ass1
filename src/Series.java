import java.util.*;
public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("Enter Number");

        int num = sc.nextInt();

        System.out.println("Printed");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
        }
    }
}
