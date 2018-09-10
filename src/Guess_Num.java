import java.util.*;

public class Guess_Num {
    public static void main(String[] args){

        int num,i;
        Random rand=new Random();
        int origin=rand.nextInt(50)+1;
        Scanner sc=new Scanner(System.in);
            for(i=0;i<50;i++) {
                System.out.println("Enter num");

                num = sc.nextInt();
                if (num == origin) {
                    System.out.println("Number guessed matches the original number ");
                    break;
                }
                else if (num < origin) {
                    System.out.println("Number guessed is less than original number");
                }
                else {
                    System.out.println("Number guessed is more than original number ");

                }
            }
        }
    }

