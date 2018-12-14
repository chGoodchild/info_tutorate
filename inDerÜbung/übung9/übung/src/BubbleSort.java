import java.util.*;

public class BubbleSort {
    BubbleSort() { }

    // Swap the two elements of m_numbers and return an error message
    // if the indexes are out of bound.
    public boolean swap(int i, int j) {
        if (i >= m_numbers.size() || j >= m_numbers.size() || i < 0 || j < 0) {
            return false;
        }

        Double tmp = m_numbers.get(i);
        m_numbers.set(i, m_numbers.get(j));
        m_numbers.set(j, tmp);
        
        return true;
    }

    // Sort the content of m_numbers.
    public void sort() {
        int n = m_numbers.size() - 1;

        // Wiederholen Sie diesen Vorgang maximal n mal, wobei n der Anzahl
        // der Elemente in der Liste entspricht. Sie können den Algorithmus
        // auch früher abbrechen, falls in einem kompletten Durchlauf keine
        // Elemente vertauscht wurden.

        int lastSwapIndex = 0;
        for (int loop = 0; loop < m_numbers.size(); ++loop) {
            lastSwapIndex = 0;
            for (int i = 0; i < n; ++i) {
                if (m_numbers.get(i) > m_numbers.get(i + 1)) {
                    lastSwapIndex = i;
                    swap(i, i + 1);
                }
            }

            if (lastSwapIndex == 0) {
                break;
            }
        }
    }

    // 
    public String toString() {
        if (m_numbers.size() == 0) { return ""; }

        // In der Übung:
        // for (int i = 1; i < (m_numbers.get(i)).size(); ++i) {

        String s = new String(m_numbers.get(0).toString());
        for (int i = 1; i < m_numbers.size(); ++i) {
            s += " " + m_numbers.get(i).toString();
            // s = s.concat(" " + m_numbers.get(i).toString();
        }
        return s;
    }

    // Setter funktion
    public void setNumbers(ArrayList<Double> numbers) {
        m_numbers = numbers;
    }

    // Getter Funktion
    public ArrayList<Double> getNumbers() {
        return m_numbers;
    }

    public static void main(String[] args) throws Exception {
        BubbleSort bs = new BubbleSort();

        ArrayList<Double> numbers = new ArrayList<Double>();
        Random r = new Random();
        for (int i = 0; i < 10; ++i) {
            numbers.add(r.nextDouble() * 100.);
        }

        bs.setNumbers(numbers);
        System.out.println("Unsorted numbers " + bs);
        bs.sort();
        System.out.println("Sorted numbers " + bs);
    }

    private ArrayList<Double> m_numbers;
}
