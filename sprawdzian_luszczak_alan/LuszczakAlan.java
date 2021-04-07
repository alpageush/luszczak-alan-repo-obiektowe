public class LuszczakAlan {
    public static void main(String[] args) {
        Sprawdzian sprawdzian = new Sprawdzian();
        sprawdzian.data = "2021-04-07";
        sprawdzian.nazwa = "PROGRAMOWANIE OBIEKTOWE";
        sprawdzian.ocena = 6;
        System.out.println(sprawdzian.data + "\n" + sprawdzian.ocena + "\n" + sprawdzian.nazwa);

        Dane dane = new Dane("Alan", "Luszczak", "2000-05-03");
        System.out.println(dane.toString());

        Tablica tablica = new Tablica();
        Tablica tablica2 = new Tablica();
        for(int i=0; i<tablica.tab.length; i++) {
            if(tablica.tab[i] < tablica2.tab[i]) System.out.println(tablica.tab[i] + " < " + tablica2.tab[i]);
            else if(tablica.tab[i] > tablica2.tab[i]) System.out.println(tablica.tab[i] + " > " + tablica2.tab[i]);
            else System.out.println(tablica.tab[i] + " = " + tablica2.tab[i]);
        }
    }
}