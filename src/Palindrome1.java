import java.util.Scanner;
public class Palindrome1 {
    public static void main(String[] args)
    {
        int n,d,s=0,r=0;
        Scanner var=new Scanner(System.in);
        System.out.println("Enter");
        int a=var.nextInt();
        n=a;
        while(n!=0)
        {
            d=n%10;
            if(d%2==0)
            {
                s=s+d;
            }
            r=r*10 +d;
            n=n/10;
        }
        if(r==a)
        {
            if(s>25)
                System.out.println(a+"s palindrome and the sum of even numbers is greater than 25");
            else
                System.out.println(a+"s palindrome and the sum of even numbers is less than 25");
        }
        else
            System.out.println(a+"is not a palindrome");    }
}
