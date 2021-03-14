import java.util.Scanner;
import java.io.File;
import java.util.Random;
import java.io.FileNotFoundException;

public class zadanie {
    public static void main(String[] args) {
        try {
            Scanner nadzieja = new Scanner(new File("." + File.separator + "uczniowie.txt"));
            Random rand = new Random();

            int[] oceny = new int[10];
            for(int i=0; i<10; i++) oceny[i] = rand.nextInt(6) + 1;
            String[] uczniowie = new String[10];
            int numer = 0;
            while(nadzieja.hasNextLine()) { uczniowie[numer] = nadzieja.nextLine(); numer++; }
            for(int i=0; i<10; i++) System.out.println(uczniowie[i] + " " + oceny[i]);
            nadzieja.close();
        } catch(FileNotFoundException e) {
            System.out.println("Plik nie istnieje: "+e.toString());
        }
    }
}