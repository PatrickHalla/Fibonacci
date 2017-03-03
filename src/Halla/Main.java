package Halla;

/**
 * Created by Halla on 03.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        FibonacciFolge folge = new FibonacciFolge();

        int zahl = 6;

        System.out.println(zahl+".Fibonaccizahl:"+folge.berechneFibonacciZahl(zahl));
    }
}
