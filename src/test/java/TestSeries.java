import org.junit.Assert;
/**
 * Created by luisfer on 4/5/2018.
 */
public class TestSeries {
    @org.junit.Test
    public void verificarPares100() {
        int[] expected= new int[101];
        expected[100]=202;
        expected[99]=200;
        expected[98]=198;
        int[] actual = Series.getNPairs(101);
        for (int i = 0; i < 3; i++) {
               Assert.assertTrue("no funciona", expected[98+i]==actual[98+i]);
        }
    }

    @org.junit.Test
    public void verificarPares0() {
        int[] expected = new int[2];
        expected[0] = 2;
        expected[1] = 4;
        int[] actual = Series.getNPairs(2);
        for (int i = 0; i < 2; i++) {
            Assert.assertTrue("no funciona", expected[0 + i] == actual[0 + i]);
        }
    }

    @org.junit.Test
    public void verificarParesneg() {
        int[] expected= new int[0];
        int[] actual= Series.getNPairs(-5);
        Assert.assertTrue("existe un problema con los negativos hahahahahah",
                            expected[0]==actual[0]);

    }



    }
