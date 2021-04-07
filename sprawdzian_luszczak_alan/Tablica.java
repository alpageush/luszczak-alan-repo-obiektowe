import java.util.Random;

public class Tablica {
    public int[] tab = new int[10];
    private Random rand = new Random();
    
    public Tablica() {
        for(int i=0; i<tab.length; i++) tab[i] = rand.nextInt(20) - 10;
    }
}