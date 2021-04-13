class Main{
    public static void main(String[] args){

        Osoba osoba = new Osoba(177,80);
        System.out.println(osoba + "\n");
        
        Osoba osoba2 = new Osoba("Alan","Łuszczak");
        System.out.println(osoba2 + "\n");

        Osoba osoba3 = new Osoba("Alan","Łuszczak", 176, 54);
        System.out.println(osoba3);
        
        Trojkat trojkat = new Trojkat(10);
        Trojkat trojkat2 = new Trojkat(10, 10);
    }
}
