import java.util.*;

// Schreiben Sie eine Klasse Sort, die Methoden zum Sortieren von
// Arrays bereitstellt.
public class Sort {
    // Konstruktor:
    Sort() { }
    // Eigendlich nicht noetig..

    // 1. Implementieren Sie eine Methode static int[] union(int[] a1,
    // int[] a2), der zwei SORTIERTE Folgen von Integer-Zahlen übergeben
    // werden. Diese Methode soll eine sortierte Folge zurückgeben, die
    // alle Elemente aus a1 und a2 enthält.
    static int[] union(int[] a1, int[] a2) {
        int[] ergebnis = new int[a1.length + a2.length];
        // Beispiel a1 = {1,3,4,5,7,8,9}
        // Beispiel a2 = {2,4,6,8,10}
        // Beispiel ergebnis = {1,2,3,4,4,5,6,..}
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < ergebnis.length; ++i) {

            if ((index1 < a1.length) && (index2 == a2.length)) {
                // This scenario occurs when a2.length < a1.length
                ergebnis[i] = a1[index1];
                index1++;
            } else if ((index2 < a2.length) && (index1 == a1.length)) {
                // This scenario occurs when a1.length < a2.length
                ergebnis[i] = a2[index2];
                index2++;
            } else if ((index1 < a1.length) && (index2 < a2.length) && (a1[index1] < a2[index2])) {
                ergebnis[i] = a1[index1];
                index1++;
            } else {
                ergebnis[i] = a2[index2];
                index2++;
            }
        }

        return ergebnis;
    }

    // 2. Bestimmen Sie die Komplexität der Methode union in Abhängigkeit
    // der Länge der Arrays a1 und a2.
    // O(n) bzw. O(ergebnis.length);

    // 3. Implementieren Sie eine rekursive Methode static int[]
    // sort(int[] array), die eine Folge von Integer-Zahlen in sortierter
    // Reihenfolge zurückgibt. 
    static int[] sort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        
        // Gehen Sie dabei wie folgt vor:
        
        // (a) Unterteilen Sie die Folge in zwei möglichst gleich
        // große Teilfolgen.

        // 1,2,3
        // 1,2,3,4

        int[] a1 = new int[array.length / 2];
        int[] a2 = new int[array.length - (array.length / 2)];

        int i = 0;

        for (; i < a1.length; i++) {
            a1[i] = array[i];
        }

        for (; i < array.length; i++) {
            // a2[i - (array.length / 2)] = array[i];
            a2[i - (a1.length)] = array[i];
        }

        // (b) Sortieren Sie beide Teilfolgen mit Hilfe eines
        // rekursiven Aufrufs der Methode sort().
        // (c) Fügen Sie die beiden sortierten Teilfolgen zusammen
        // mittels der zuvor imple- mentierten Methode union().
        return union(sort(a1), sort(a2));

    }
    // 4. Bestimmen Sie die Komplexität der Methode sort in Abhängigkeit
    // der Länge des Arrays array.
    // log_2(n) * n ---> Siehe PDF

    public static void main(String[] args) throws Exception {
        int[] numbers = new int[10];
        Random r = new Random();

        for (int i = 0; i < 10; ++i) {
            numbers[i] = (int) (r.nextDouble() * 100.);
        }

        for (int i = 0; i < numbers.length; ++i) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nSorted:");
        int[] sortedNumbers = Sort.sort(numbers);
        for (int i = 0; i < sortedNumbers.length; ++i) {
            System.out.print(sortedNumbers[i] + " ");
        }
        System.out.println();
    }
}
