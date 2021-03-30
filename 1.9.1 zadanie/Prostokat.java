public class Prostokat {
    private double dlugosc = 0;
    private double szerokosc = 0;

    public Prostokat(double d, double s) {
        dlugosc = d;
        szerokosc = s;
    }

    public double pole() {
        return dlugosc * szerokosc;
    }

    public double obwod() {
        return 2 * dlugosc + 2 * szerokosc;
    }
}
