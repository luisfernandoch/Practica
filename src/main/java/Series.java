import java.util.Arrays;

/**
 * Created by luisfer on 4/5/2018.
 */
public class Series {

    public static void main(String[] args){
        //System.out.print(Arrays.toString(getNPairs(-5)));

    }

    static int[] getNPairs(int n) {
        int[] res = new int[n];
        for (int i = 1; i <= n; i++) {
            res[i-1]=i*2;
        }
        return res;
    }
}
