public class Trojkat {
    private double obwod = 0;
    private double pole = 0;

    public Trojkat(double dlugosc) {
        // trojkat rownoboczny to tylko jedna wartosc
        double podstawa_half = dlugosc / 2;

        obwod = 3 * dlugosc;
        pole = dlugosc * Math.sqrt(dlugosc * dlugosc - podstawa_half * podstawa_half) / 2;
    }

    public Trojkat(double przyp1, double przyp2) {
        // trojkat prostokatny
        
        obwod = przyp1 + przyp2 + Math.sqrt(przyp1 * przyp1 + przyp2 * przyp2);
        pole = (przyp1 * przyp2) / 2;
    }

    public Trojkat(double dlug1, double dlug2, double dlug3, double wysokosc) {
        // trojkat prostokatny
        
        obwod = dlug1 + dlug2 + dlug3;
        pole = dlug1 * wysokosc;

        // tutaj prosze pana nie jest okreslone ktora to podstawa to wzialem jakakolwiek
    }

    @Override
    public String toString() {
        return obwod + " " + pole;
    }
}