import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        //fun(4,5,6,7,8,9,5,3);
        multiple(2,4,"rahul","ujjwal");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
