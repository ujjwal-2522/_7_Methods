public class Scope {
    public static void main(String[] args) {
        int a = 45;
        int b = 60;
        {
            // int a= 78; already intialised outside the block, hence you cnanot intialise again
            a = 100;// reassign the original ref variable to another value
            System.out.println(a);
            int c = 78;
            // values intialised in this block , will remain in this block
        }
        // System.out.println(c); // Can not use outside the block
    }static void random(int marks){
            int num=67;
            System.out.println(num);
            System.out.println(marks);
        }
    }

