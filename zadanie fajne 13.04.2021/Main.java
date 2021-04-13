class Main{
    public static void main(String[] args){

        Osoba os = new Osoba(177,80);
        System.out.println(os + "\n");
        
        Osoba os2 = new Osoba("Alan","Łuszczak");
        System.out.println(os2 + "\n");

        Osoba os3 = new Osoba("Alan","Łuszczak", 176, 54);
        System.out.println(os3);
    }
}