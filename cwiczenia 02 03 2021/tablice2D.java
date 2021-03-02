public class tablice2D {
    public static void main(String[] args) {
        tablica2x2();
    }

    private static void tablica2x2() {
        int [][] tab = {{1,2,3,4},{}};
        for(int i=0; i<=tab[0].length; i++) System.out.println(tab[0][i]);
    }
}