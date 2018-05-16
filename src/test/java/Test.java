import org.junit.Assert;

/**
 * Created by luisfer on 4/5/2018.
 */
public class Test {

    @org.junit.Test
    public void verificarPares(){
        int n=3;
        int[] expectedResult = new int[n];
        expectedResult[0]=2;
        expectedResult[1]=4;
        expectedResult[2]=6;
        int[] actualResult = Main.pares(n);
        for (int i = 0; i < 3; i++) {
            Assert.assertTrue("La serie no devuelve valores correctos",expectedResult[i]==actualResult[i]);
        }
    }
}
