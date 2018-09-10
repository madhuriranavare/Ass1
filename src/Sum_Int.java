import java.util.Scanner;
public class Sum_Int {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input:");
        String str=scanner.nextLine();
        String[] inputStr=str.trim().split("\\s");
        int num,sum=0;
        for(int i=0;i<inputStr.length;i++)
        {
            try{
                num=Integer.parseInt(inputStr[i]);
                sum=sum+num;
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage()+" is non-integer value");
            }
        }
        System.out.println(sum);
    }
}
