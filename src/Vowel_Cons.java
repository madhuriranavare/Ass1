import java.util.Scanner;
import java.lang.*;
//import java.*;

public class Vowel_Cons {
    public static void main(String[] arg){
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        str=sc.nextLine();
        int i;
        int j;
        int k;
        char ch;
        for(i=0;i<str.length();i++){
            ch=str.charAt(i);
           // System.out.println(ch);
                if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
                    if(ch == 'a' || ch == 'e' || ch == 'i'
                            || ch == 'o' || ch == 'u') {
                        System.out.println(ch + ":Vowel");

                    }
                    else{
                        System.out.println(ch + ":Consonent");
                    }
                }
                else {
                    System.out.println("Error: Input is not a letter");
                }
        }

    }
}
