/*
Hier soll der Name und Studiengang an den entsprechenden Stellen des Strings
text eingetragen werden.

• substring
• replace
• concat
• toLowerCase

*/

public class ChangeString3 {
    public static void main(String[] args) {
        String my_name = "Max Mustermann";
        String my_subject = "Informatik";
        String text = "Mein Name ist my_name und studiere my_subject.";
        // Fuegen Sie Ihren Code hier ein

        text = text.replace("my_name", my_name);
        text = text.replace("my_subject", my_subject);

        System.out.println(text);
        // Mein Name ist Max Mustermann und studiere Informatik.
    }
}
