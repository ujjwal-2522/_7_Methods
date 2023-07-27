public class Shadowing {
    static int x=90; // Since x is difined again therfore this x will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);//90
        int x;// declaring
       // System.out.println(x); scope will begin when value is intialised
        x= 40;// intialising
        System.out.println(x);//40
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
