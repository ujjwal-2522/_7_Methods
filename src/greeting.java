import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
       // greeting();
        Scanner in=new Scanner(System.in);
        String name=in.next();
        String message=mygreet(name);
        System.out.println(message);
    }

    static String mygreet(String name) {
        String mess= "Hello " + name;
        return mess;
    }

    static void greeting(){
        System.out.println("hello world");
    }
}
