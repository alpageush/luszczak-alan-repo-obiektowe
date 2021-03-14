import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class zadanie {
    static String[][] bazadanych = new String[16][13];
    static Scanner wakacyjny_romans = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            Scanner nadzieja = new Scanner(new File("." + File.separator + "dane.txt"));
            
            for(int i=0; i<16; i++) {
                String linia = "";
                if(nadzieja.hasNextLine()) linia = nadzieja.nextLine();
                String[] liniapodzielona = new String[15];
                liniapodzielona = linia.split(" ");
                for(int y=0; y<13; y++) bazadanych[i][y] = liniapodzielona[y];
            }
            nadzieja.close();

            while(0<1) {
                System.out.print("\n1. Pokaz wszystkie dane\n2. Pokaz dane z jednego wojewodztwa\n3. Pokaz wartosc jelenia w 2009 i 2010\n4. Wlasne wyswietlanie\n5. Zamknij\nWybierz: ");
                switch(wakacyjny_romans.nextInt()) {
                    case 1: for(int i=0; i<16; i++) wyswietlWojewodztwo(i); break;
                    case 2: jednoWojewodztwo(); break;
                    case 3: jelen(); break;
                    case 4: wlasne(); break;
                    case 5: System.exit(1); break;
                    default: continue;
                }
            }
        } catch(FileNotFoundException e) {
            System.out.println("Plik nie istnieje: " + e.toString());
        }
    }

    private static void jednoWojewodztwo() {
        System.out.print("\n1. Lodzkie\n2. Mazowieckie\n3. Malopolskie\n4. Slaskie\n5. Lubelskie\n6. Podkarpackie\n7. Podlaskie\n8. Swietokrzyskie\n9. Lubuskie\n10. Wielkopolskie\n11. Zachodniopomorskie\n12. Dolnoslaskie\n13. Opolskie\n14. Kujawsko-Pomorskie\n15. Pomorskie\n16. Warminsko-Mazurskie\nWybierz: ");
        switch(wakacyjny_romans.nextInt()) {
            case 1: wyswietlWojewodztwo(0); break;
            case 2: wyswietlWojewodztwo(1); break;
            case 3: wyswietlWojewodztwo(2); break;
            case 4: wyswietlWojewodztwo(3); break;
            case 5: wyswietlWojewodztwo(4); break;
            case 6: wyswietlWojewodztwo(5); break;
            case 7: wyswietlWojewodztwo(6); break;
            case 8: wyswietlWojewodztwo(7); break;
            case 9: wyswietlWojewodztwo(8); break;
            case 10: wyswietlWojewodztwo(9); break;
            case 11: wyswietlWojewodztwo(10); break;
            case 12: wyswietlWojewodztwo(12); break;
            case 13: wyswietlWojewodztwo(13); break;
            case 14: wyswietlWojewodztwo(14); break;
            case 15: wyswietlWojewodztwo(15); break;
            case 16: wyswietlWojewodztwo(16); break;
        }
    }

    private static void wyswietlWojewodztwo(int id) {
        System.out.print("\n" + bazadanych[id][0] + ":\n jelenie:\n  ilosc (2009): " + bazadanych[id][1] + "\n  ilosc (2010): " + bazadanych[id][2] + "\n  wartosc (2009): " + bazadanych[id][3] + "\n  wartosc (2010): " + bazadanych[id][4] + "\n sarny:\n  ilosc (2009): " + bazadanych[id][5] + "\n  ilosc (2010): " + bazadanych[id][6] + "\n  wartosc (2009): " + bazadanych[id][7] + "\n  wartosc (2010): " + bazadanych[id][8] + "\n dziki:\n  ilosc (2009): " + bazadanych[id][9] + "\n  ilosc (2010): " + bazadanych[id][10] + "\n  wartosc (2009): " + bazadanych[id][11] + "\n  wartosc (2010): " + bazadanych[id][12] + "\n");
    }

    private static void jelen() {
        for(int i=0; i<16; i++) System.out.print("\n" + bazadanych[i][0] + ":\n jelenie:\n  wartosc (2009): " + bazadanych[i][3] + "\n  wartosc (2010): " + bazadanych[i][4] + "\n");
        System.out.print("\n");
    }

    private static void wlasne() {
        int wojewodztwo = 0; // 0 - wszystkie
        int rok = 0; //  0 - wszystkie
        int zwierze = 0; // 0 - wszystkie

        System.out.print("\nWOJEWODZTWO\n0. Wszystkie\n1. Lodzkie\n2. Mazowieckie\n3. Malopolskie\n4. Slaskie\n5. Lubelskie\n6. Podkarpackie\n7. Podlaskie\n8. Swietokrzyskie\n9. Lubuskie\n10. Wielkopolskie\n11. Zachodniopomorskie\n12. Dolnoslaskie\n13. Opolskie\n14. Kujawsko-Pomorskie\n15. Pomorskie\n16. Warminsko-Mazurskie\nWybierz: ");
        wojewodztwo = wakacyjny_romans.nextInt();

        System.out.print("\nROK\n0. Wszystkie\n1. 2009\n2. 2010\nWybierz: ");
        rok = wakacyjny_romans.nextInt();

        System.out.print("\nZWIERZE\n0. Wszystkie\n1. jelen\n2. sarna\n3. dzik\nWybierz: ");
        zwierze = wakacyjny_romans.nextInt();

        wyswietl(wojewodztwo, rok, zwierze);
    }

    static void wyswietl(int wojewodztwa, int rok, int zwierze) {
        if (wojewodztwa == 0) {
            for (int i = 0; i < 16; i++) {
                String text = "\n" + bazadanych[i][0] + ":\n";

                if(zwierze == 1 || zwierze == 0) {
                    // jelen
                    text += " jelenie:\n";
                    if(rok == 1 || rok == 0) {
                        text += "  ilosc (2009): " + bazadanych[i][1] + "\n";
                        text += "  wartosc (2009): " + bazadanych[i][3] + "\n";
                    }
                    if(rok == 2 || rok == 0) {
                        text += "  ilosc (2010): " + bazadanych[i][2] + "\n";
                        text += "  wartosc (2010): " + bazadanych[i][4] + "\n";
                    }
                } if(zwierze == 2 || zwierze == 0) {
                    // sarna
                    text += " sarny:\n";
                    if(rok == 1 || rok == 0) {
                        text += "  ilosc (2009): " + bazadanych[i][5] + "\n";
                        text += "  wartosc (2009): " + bazadanych[i][7] + "\n";
                    }
                    if(rok == 2 || rok == 0) {
                        text += "  ilosc (2010): " + bazadanych[i][6] + "\n";
                        text += "  wartosc (2010): " + bazadanych[i][8] + "\n";
                    }
                } if(zwierze == 3 || zwierze == 0) {
                    // dzik
                    text += " dziki:\n";
                    if(rok == 1 || rok == 0) {
                        text += "  ilosc (2009): " + bazadanych[i][9] + "\n";
                        text += "  wartosc (2009): " + bazadanych[i][11] + "\n";
                    }
                    if(rok == 2 || rok == 0) {
                        text += "  ilosc (2010): " + bazadanych[i][10] + "\n";
                        text += "  wartosc (2010): " + bazadanych[i][12] + "\n";
                    }
                }
                System.out.print(text);
            }
        } else {
            String text = "\n" + bazadanych[wojewodztwa][0] + ":\n";

            if(zwierze == 1 || zwierze == 0) {
                // jelen
                text += " jelenie:\n";
                if(rok == 1 || rok == 0) {
                    text += "  ilosc (2009): " + bazadanych[wojewodztwa][1] + "\n";
                    text += "  wartosc (2009): " + bazadanych[wojewodztwa][3] + "\n";
                }
                if(rok == 2 || rok == 0) {
                    text += "  ilosc (2010): " + bazadanych[wojewodztwa][2] + "\n";
                    text += "  wartosc (2010): " + bazadanych[wojewodztwa][4] + "\n";
                }
            } else if(zwierze == 2 || zwierze == 0) {
                // sarna
                text += " sarny:\n";
                if(rok == 1 || rok == 0) {
                    text += "  ilosc (2009): " + bazadanych[wojewodztwa][5] + "\n";
                    text += "  wartosc (2009): " + bazadanych[wojewodztwa][7] + "\n";
                }
                if(rok == 2 || rok == 0) {
                    text += "  ilosc (2010): " + bazadanych[wojewodztwa][6] + "\n";
                    text += "  wartosc (2010): " + bazadanych[wojewodztwa][8] + "\n";
                }
            } else if(zwierze == 3 || zwierze == 0) {
                // dzik
                text += " dziki:\n";
                if(rok == 1 || rok == 0) {
                    text += "  ilosc (2009): " + bazadanych[wojewodztwa][9] + "\n";
                    text += "  wartosc (2009): " + bazadanych[wojewodztwa][13] + "\n";
                }
                if(rok == 2 || rok == 0) {
                    text += "  ilosc (2010): " + bazadanych[wojewodztwa][10] + "\n";
                    text += "  wartosc (2010): " + bazadanych[wojewodztwa][12] + "\n";
                }
            }
            System.out.print(text);
        }
    }
}