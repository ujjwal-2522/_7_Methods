import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
      int ans =sum3(20,30);
        System.out.println(ans);

    }
        // pass the value of numbers when you are calling the method in main()
    static int sum3(int a ,int b){
        int sum =a+b;
        return sum ;
    }






        // return the value

    static int sum2(){
        Scanner in=new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter number 1:");
        num1=in.nextInt();
        System.out.println("Enter number 2:");
        num2=in.nextInt();
        sum = num1 +num2;
        return sum;

    }

    static void sum(){
         Scanner in=new Scanner(System.in);
         int num1,num2,sum;
         System.out.println("Enter number 1:");
         num1=in.nextInt();
         System.out.println("Enter number 2:");
         num2=in.nextInt();
         sum = num1 +num2;
         System.out.println("The sum is :" +sum);
     }
    /*
    *     return_type name(){
    *         //body
    *         return statement;
    *     }
    *
    *
    * */
}
