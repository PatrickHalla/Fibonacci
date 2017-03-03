package Halla;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Halla on 03.03.2017.
 */
public class FibonacciFolgeTest {
    @Test
    public void berechneFibonacciZahl() throws Exception {
        FibonacciFolge folge = new FibonacciFolge();

        int zahl = 6;

        System.out.println(zahl+".Fibonaccizahl:"+folge.berechneFibonacciZahl(zahl));
    }

}