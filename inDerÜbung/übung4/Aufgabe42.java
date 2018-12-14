// Aufgabe 4.2

// 1. Identifizieren Sie Konstruktoren, Methoden, Instanzvariablen,
// lokale Variablen, Parameter und Argumente.

// 2. Was passiert in Cellphone(String tone), wenn man nicht das
// Schlüsselwort this verwendet?

// 3. Erweitern Sie die Klasse um eine Methode setRingTone mit einem
// String Parameter, die den Standardklingelton“ ändert.”

// 4. Welche Ausgabe liefert folgendes Programm? Lösen Sie die Aufgabe
// ohne den Compiler zu verwenden.

/*

Cellphone p = new Cellphone();
// The ring tone is "ringringring"
p.ring();   // Rings with "ringringring"
p.setRingTone("dingdong");
// The ring tone is "dingdong"
p.ring("beepbeep"); // Rings with "beepbeep"
// The ring tone is still "dingdong"
p.ring(); // Rings with "dingdong"

Rings with:
ringringring
beepbeep
dingdong

*/


// Betrachten Sie die folgende Klasse Cellphone.
public class Aufgabe42 {
    public Aufgabe42() {
        this.tone = "ringringring";
    }
    
    public Aufgabe42(String str) {
        this.tone = str;
    }
    
    public void ring() {
        System.out.println(this.tone);
    }
    
    public void ring(String str) {
        System.out.println(str);
    }

    public void setRingTone(String Parameter) {
        this.tone = Parameter;
    }

    private String tone;
}


