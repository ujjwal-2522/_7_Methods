import java.lang.reflect.Array;
import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        // create an array
        int[] arr={1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void change(int[] num){
        num[0]=99;
    }
}
