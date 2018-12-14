public class A41Main {
    public static void main(String[] args) {
        Aufgabe41 stud = new Aufgabe41("Max", "Mustermann", "ESE");
        System.out.println(stud);
        stud.setSubject("Info");
        System.out.println(stud);
        stud.setFirstName("Maxi");

        // S contains all information about the Student "stud"
        // String s = stud.toString();
        // System.out.println(s);
        System.out.println(stud.toString());
    }
}
