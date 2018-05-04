import java.util.Arrays;

/**
 * Created by luisfer on 30/4/2018.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(pares(5)));
        System.out.println(Arrays.toString(fibonacci(1)));
        System.out.println(Arrays.toString(primos(1)));
    }

    public static int[] pares(int n) {
        int[] numerosPares= new int[n];
        for (int i = 1; i <= n; i++) {
            numerosPares[i-1]=i*2;
        }
        return numerosPares;
    }

    public static int[] fibonacci(int n) {
        int[] secuenciaFibo = new int[n];
        secuenciaFibo[0] = 0;
        if(n>1){
            secuenciaFibo[1] = 1;
            for (int i = 2; i < n; i++) {
                secuenciaFibo[i] = secuenciaFibo[i - 2] + secuenciaFibo[i - 1];
            }
        }
        return  secuenciaFibo;
    }

    public static int[] primos(int n) {
        int[] numerosPrimos= new int[n];
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
                numerosPrimos[cont]=i;
                cont++;
            }
            i++;
        }
        return  numerosPrimos;
    }
}
