public class A42Main {
    public static void main(String[] args) {
        Aufgabe42 phone = new Aufgabe42();
        // The ring tone is "ringringring"
        phone.ring();   // Rings with "ringringring"
        phone.setRingTone("dingdong");
        // The ring tone is "dingdong"
        phone.ring("beepbeep"); // Rings with "beepbeep"
        // The ring tone is still "dingdong"
        phone.ring(); // Rings with "dingdong"


        /*
          Rings with:
          ringringring
          beepbeep
          dingdong
        */
    }
}
