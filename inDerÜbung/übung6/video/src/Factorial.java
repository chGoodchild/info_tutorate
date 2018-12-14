
/*
  Die Fakultät n !  ist eine Funktion, die jeder natürlichen Zahl n
  das Produkt aller natürli- chen Zahlen kleiner und gleich dieser
  Zahl zuordnet: n !  = n Y k =1 k = 1  2  : : :  n Zusätzlich
  gilt 0! = 1 .  Schreiben Sie ein Java-Programm, das den Benutzer zur
  Eingabe einer ganzen Zahl n auffordert und anschließend den Wert von
  n !  ausgibt. Für eine negative ganze Zahl soll der Wert
*/

import java.io.*;
import java.util.*;

public class Factorial {
    static long factorial(long n) {
        if (n < 0) {
            return -1;
        }
        
        long result = 1;
        for (long i = 1; i <= n; i++) {
            // result *= i;
            result = result * i;
        }
        return result;

        /*
          long i = 1;
          while (i <= n) {
          // result *= i;
          result = result * i;
          i++;
          }
          return result;
        */
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben Sie den Wert von n ein:");
        long n = Integer.parseInt(br.readLine());
        System.out.println("Fakultät: " + factorial(n));
    }
}
