import java.io.*;
import java.util.*;

public class Measurements {

    // No constructor! ---> Default constructor is public.

    public void readList(String filename) throws IOException {
        measurements = new ArrayList<Double>();
        FileInputStream fis = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        Double d;
        while (br.ready()) {
            d = Double.parseDouble(br.readLine());
            measurements.add(d);
        }
    }

    public String toString() {
        return measurements.toString();
    }

    public double sum() {
        Iterator<Double> it = measurements.iterator();
        double sum = 0;
        while (it.hasNext()) {
            sum += it.next();
        }
        return sum;
    }

    public double max() {
        Iterator<Double> it = measurements.iterator();
        double maximum = Double.MIN_VALUE;  // The smallest value that can
        // be represented with a
        // double.
        while (it.hasNext()) {
            maximum = Math.max(it.next(), maximum);
        }
        return maximum;
    }

    public double min() {
        Iterator<Double> it = measurements.iterator();
        double minimum = Double.MAX_VALUE;  // The largest possible value
        // that can be represented
        // with a double.
        while (it.hasNext()) {
            minimum = Math.min(it.next(), minimum);
        }
        return minimum;
    }


    public double mean() {
        double sum = this.sum();
        int size = measurements.size();
        /*
          Iterator<Double> it = measurements.iterator();
          int size = 0;
          double sum = 0;
          while (it.hasNext()) {
          sum += it.next();
          size++;
          }
        */
        return (sum / size);
    }

    public ArrayList<Double> normalize() {
        ArrayList<Double> normalized = new ArrayList<Double>();
        Iterator<Double> it = measurements.iterator();
        double sum = sum();
        while (it.hasNext()) {
            normalized.add(it.next() / sum);
            // Double d = it.next();
        }
        return normalized;
        // return (sum / size);
    }

    public static void main(String[] args) throws IOException {
        Measurements m = new Measurements();
        m.readList("../data.dat");
        System.out.println(m);
        System.out.println("Sum = " + m.sum());
        System.out.println("Mean = " + m.mean());
        System.out.println("Max = " + m.max());
        System.out.println("Min = " + m.min());
        System.out.println(m.normalize());
    }
    private ArrayList<Double> measurements;
}
