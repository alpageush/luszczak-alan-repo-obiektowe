public class CwiczenieObiektowe_1 {
    public static void main(String[] args) {
        MojeDane mojeDane = new MojeDane("Alan", "Luszczak", "2PTN");
        System.out.println(mojeDane.imie + "\n" + mojeDane.nazwisko + "\n" + mojeDane.klasa);

        Logowanie logowanie = new Logowanie();
        System.out.println(logowanie.toString());

        Kolo k1 = new Kolo(4);
        Kolo k2 = new Kolo(20);
        System.out.println("k1: " + k1.pole() + " " + k1.obwod());
        System.out.println("k2: " + k2.pole() + " " + k2.obwod());

        Kwadrat kwadrat = new Kwadrat(2);
        System.out.println("kwadrat: " + kwadrat.pole() + " " + kwadrat.obwod());

        Prostokat prostokat = new Prostokat(10, 5);
        System.out.println("prostokat: " + prostokat.pole() + " " + prostokat.obwod());
    }
}