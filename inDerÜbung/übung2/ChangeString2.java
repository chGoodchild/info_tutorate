// Hier soll “Fischers Fritz fischt frische Fische, frische Fische
// fischt Fischers Fritz” ausgegeben werden. Verwenden Sie maximal
// drei Methodenaufrufe.

// • substring
// • replace
// • concat
// • toLowerCase

// Fischers Fritz fischt frische Fische, frische Fische fischt Fischers Fritz
// Fischers Fritz fischt frische Fische, frische Fische fischt Fischers Fritz

public class ChangeString2 {
    public static void main(String[] args) {
        String str = "fiScHerS fRItz fiScht frIsChE fIscHe, "
            + "frIsche FiscHe fiSCHt FiSchers FRitZ";
        // Fuegen Sie Ihren Code hier ein

        str = str.toLowerCase();
        str = str.replace("fische", "Fische");
        str = str.replace("fritz", "Fritz");
        
        System.out.println(str);
    }
}
