// Aufgabe 4.1
// Betrachten Sie den folgenden Auszug der Klasse Student, die eine
// Studentin bzw. einen Studenten repräsentiert. Der Vorname, Nachname
// sowie der Studiengang wird dabei in den entsprechenden
// Instanzvariablen firstName, surname und subject gespeichert.

// 1. Vervollständigen Sie den Konstruktor der Klasse Student.

// 2. Vervollständigen Sie die Methoden setFirstName, setSurname sowie
// setSubject zum Setzen und getFirstName, getSurname und getSubject
// zum Auslesen der Instanzvariablen.

// 3. Vervollständigen Sie die Methode toString, die eine Beschreibung
// der Studentin/des Studenten in der Form Max Mustermann studiert
// Informatik zurückgibt.

// 4. Schreiben Sie eine main-Methode, um Ihre Klasse zu
// testen. Erzeugen Sie dafür ein Instanz der Klasse Student mit Ihren
// Daten und geben Sie dessen Beschreibung mit der Methode toString
// auf dem Monitor aus.

public class Aufgabe41 {

    public Aufgabe41(String firstN, String surn, String subj) {
        // ...
        this.firstName = firstN;
        this.surname = surn;
        this.subject = subj;
    }

    public void setFirstName(String s) {
        // ...
        this.firstName = s;
    }

    public void setSurname(String s) {
        // ...
        this.surname = s;
    }

    public void setSubject(String s) {
        // ...
        this.subject = s;
    }
    
    public String getFirstName() {
        // ...
        return this.firstName;
    }

    public String getSurname() {
        // ...
        return this.surname;
    }
    public String getSubject() {
        // ...
        return this.subject;
    }
    public String toString() {
        // ...
        // String out;
        return (firstName + " " + surname + " studiert " + subject);
        // return out;
    }

    private String firstName;
    private String surname;
    private String subject;
}


