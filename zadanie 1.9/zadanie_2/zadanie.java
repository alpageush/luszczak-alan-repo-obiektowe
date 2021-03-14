import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.io.FileNotFoundException;

public class zadanie {
    public static void main(String[] args) {
        try {
            Scanner nadzieja = new Scanner(new File("." + File.separator + "czy_losowac.txt"));
            Scanner wakacyjny_romans = new Scanner(new File("." + File.separator + "ile_liczb.txt"));
            Random rand = new Random();

            int[] czylosowac = new int[10];
            int[] ileliczb = new int[10];

            String linia = nadzieja.nextLine();
            for(int i=0; i<10; i++) {
                czylosowac[i] = Integer.parseInt(linia.split(" ")[i]);
                ileliczb[i] = Integer.parseInt(wakacyjny_romans.nextLine());
                if(czylosowac[i] == 0) System.out.print("Wczytalem liczbe 0 - nie losuje liczby");
                else if(czylosowac[i] == 1) for(int y=0; y<=ileliczb[i]; y++)  System.out.print(rand.nextInt(80) + " ");
                System.out.print("\n");
            }
            System.out.print("Odczytalem wszystkie liczby!");

            nadzieja.close();
            wakacyjny_romans.close();
        } catch(FileNotFoundException e) {
            System.out.println("Plik nie istnieje: " + e.toString());
        }
    }
}