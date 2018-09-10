import java.util.*;
public class Reverse_String {
    public static void main(String[] args){
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        str=sc.nextLine();

        //char ch;
        char[] ch = str.toCharArray();


        for (int i = ch.length-1; i>=0; i--)
            System.out.print(ch[i]);

    }
}
