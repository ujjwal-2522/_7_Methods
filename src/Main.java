import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q input of 2 number and print the sum
        Scanner in=new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter number 1:");
        num1=in.nextInt();
        System.out.println("Enter number 2:");
         num2=in.nextInt();
        sum = num1 +num2;
        System.out.println("The sum is :" +sum);
    }
}