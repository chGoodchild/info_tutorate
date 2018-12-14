import java.io.*;
import java.util.*;

public class Sinus {
    static double sin(double x) {
        // if(x is negative) return -sin(-x);

        // Normalisieren -pi bis pi
        while (x < -Math.PI) {
            x += 2 * Math.PI;
        }

        while (x >= Math.PI) {
            x -= 2 * Math.PI;    // x = x - 2 * Math.PI;
        }

        // AB DA KANN DAS VORZEICHEN VON DEM X VERAENDERT SEIN

        // Potenzreihe       (1)(x / 1) + (-1)^(n) * ((x^(n))(x * x)) / ((2 * n)(2 * n + 1)(vorgaenger))
        int n = 0;
        double factorial = 1;
        double power = x;
        double bruch = power / factorial; // power / factorial
        double sinResult = bruch; // (1 ist egal)
        double factor = -1;

        // Abs, warum?
        /* Abbrechen wenn < 1e-7 */
        while (Math.abs(bruch) > 1e-7) { 
            n++;
            factorial *= 2 * n;
            factorial *= 2 * n + 1;
            // sinResult += factor * ((power * (x * x)) / (factorial)); ---> Falsch
            power *= (x * x);
            
            bruch = power / factorial;
            sinResult += factor * bruch;
            // Wichtig! nicht so:
            // sinResult += factor * (power / factorial);
            // Warum?
            
            factor *= -1;  // Vorfaktor updaten
        }

        return sinResult;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Von welchem Wert sollen wir sinus Berechnen? (x eingeben..)");
        double x = Double.parseDouble(br.readLine());
        System.out.println("Naeherung: " + sin(x));
        System.out.println("Math.sin: " + Math.sin(x));
    }
}
