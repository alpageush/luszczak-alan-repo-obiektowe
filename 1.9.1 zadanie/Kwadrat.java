public class Kwadrat {
    private double dlugosc = 0;

    public Kwadrat(double a) {
        dlugosc = a;
    }

    public double pole() {
        return dlugosc * dlugosc;
    }

    public double obwod() {
        return 4 * dlugosc;
    }
}
