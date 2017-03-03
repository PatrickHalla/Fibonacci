package Halla;

/**
 * Created by Halla on 03.03.2017.
 */
public class FibonacciFolge {

    //brechne die Fibonaccizahl an der Stele n
    public int berechneFibonacciZahl(int i){
        if(i<=0) // fuer negative Zahl auch 0!
        return 0;
        else if(i==1)
            return 1;
        else
            //rekursiver Aufruf
            return berechneFibonacciZahl(i-2)+berechneFibonacciZahl(i-1);
    }
}
