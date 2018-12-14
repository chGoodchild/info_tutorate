public class Pascal {
    public static int[] pascal(int zeile) {
        int[] erg = new int[zeile + 1];
        for (int spalte = 0; spalte <= zeile; spalte++) {
            erg[spalte] = help(zeile, spalte);
        }
        return erg;
    }
	
    public static int help(int zeile, int spalte) {
        if (spalte == 0 || spalte == zeile) {
            return 1;
        } else {
            return help(zeile - 1, spalte) + help(zeile - 1, spalte - 1);
        }
    }

    /*	
       public static void main(String [] arg) {
       int n = 4;
       int[] erg = pascal(n);
       for (int i = 0; i <= n; i++) {
       System.out.print(erg[i] + " ");
       }
       System.out.println("");
       }

    */

    public static void main(String [] arg) {
        int max = 6;
        int[] erg = new int[max];
        for (int n = 0; n <= max; n++) {
            for (int i = 0; i <= ((max - n)); i++) {
                System.out.print("\t");
            }
            erg = pascal(n);
            for (int i = 0; i <= n; i++) {
                System.out.print(erg[i] + "\t\t");
            }
            System.out.println("");
        }
    }

}
