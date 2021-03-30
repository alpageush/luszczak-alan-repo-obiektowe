public class Kolo {
    private double liczba_pi = 3.1415;
    private double radius = 0;

    public Kolo(double r) {
        radius = r;
    }

    public double pole() {
        return liczba_pi * radius * radius;
    }

    public double obwod() {
        return 2 * liczba_pi * radius;
    }
}
