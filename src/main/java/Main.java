import java.util.Arrays;

/**
 * Created by luisfer on 30/4/2018.
 */
public class Main {

    public static void main(String[] args) {

        pares (1);
        primos(1);
    }

    public static void pares(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * 2 + " ");
        }
        System.out.println();
    }

    public static void fibonacci(int n) {
        int[] m = new int[n];

        m[0] = 0;
        if(n>1){
            m[1] = 1;
            for (int i = 2; i < n; i++) {
                m[i] = m[i - 2] + m[i - 1];
            }
        }
        System.out.print(Arrays.toString(m));

        System.out.println();
    }

    public static void primos(int n) {
        int i=2;
        int cont=0;
        while (cont<n){
            boolean primo=true;
            for (int j = i-1; j >= 2; j--) {
                if(i%j==0){
                    primo=false;
                }
            }
            if(primo) {
                System.out.print(i+"  " );
                cont++;
            }
            i++;
        }

        System.out.println();
    }
}
