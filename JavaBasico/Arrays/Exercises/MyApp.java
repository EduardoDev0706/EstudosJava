import java.util.Arrays;

public class MyApp {

    public static void main(String[] args) {
        
        /* 
        Scanner MyObj = new Scanner(System.in);
        int[] a  = {1, 2, 3, 4};

        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");

        MyObj.close();
        */

        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            a[i] *= a[i];
            System.out.println(a[i]);
        }



        

    }

    public static double sum(double[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }
}