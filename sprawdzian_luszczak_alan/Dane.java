public class Dane {
    private String imie = "";
    private String nazwisko = "";
    private String data_urodzenia = "";
    
    public Dane(String i, String n, String d) {
        imie = i;
        nazwisko = n;
        data_urodzenia = d;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " urodzony " + data_urodzenia;
    }
}