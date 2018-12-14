//Hier soll “It is Friday today and it is sunny!” ausgegeben werden.

public class one {
    public static void main(String[] args) {
        String str = "It is sunny today and it is Friday!";
        // Fuegen Sie Ihren Code hier ein
        str = str.replace("sunny", "Friday");
        // "It is Friday today and it is Friday!";
        str = str.replace("Friday!", "sunny!");
        // str = "It is Friday today and it is sunny!";
        System.out.println(str);
    }
}
