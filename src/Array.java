import java.util.Arrays;

/**
 * Created by Дима on 06.11.2016.
 */
public class Array {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[2] = 3;
        array[3] = 23;
        array[1] = 3;
        array[4] = 536;
        array[5] = -20;
        array[6] = 45;
        array[7] = 20;
        array[8] = 0;
        array[9] = 2;
        array[0] = 20;
        System.out.println(sum(array));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(multiplication(array));
        System.out.println(maxPositive(array));
        System.out.println(modulus(array));
        System.out.println(secondLargest(array));
    }

    public static int sum(int array[]) {
        int a = 0;

        for (int bal : array) {
            a += bal;

        }
        return a;
    }

    public static int min(int array[]) {
        int c = array[0];
        for (int bal : array) {
            if (bal < c) {
                c = bal;
            }


        }

        return c;


    }

    public static int max(int array[]) {

        int m = array[0];
        for (int bal : array) {

            if (bal > m) {
                m = bal;
            }
        }
        return m;
    }

    public static int multiplication(int array[]) {
        int h = 1;
        for(int bal : array){

            h *= bal;
        }
     return h;
    }

    public static int maxPositive(int array[]){

        int g = array[0];
        for(int bal : array){

          if(bal > g)
              g = bal;
        }
        return g;
    }

    public static int modulus(int[] array){
        int k = 0;
        if(array[array.length-1] != 0) {
            k = array[0] % array[array.length-1];
        }
        return k;
    }

    public static int secondLargest(int[] array) {
             for(int l = 2; l>0; l--) {
             for (int i = 0; i < array.length; i++)
                 if (array[i] > array[i + 1]) {
                     int x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = l;
                }
             }
        return array[array.length - 2];
        }
    }

