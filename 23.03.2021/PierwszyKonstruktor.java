import java.util.Scanner;

class PierwszyKonstruktor{
    public static void main (String[] args){
        /*
        MojeBmi mb = new MojeBmi(190,86);
        mb.wzrost = 160;
        mb.waga = 80;
        */
        
        //Zmiana atrybutow obiektu poprzez konstruktor
        MojeBmi mb = new MojeBmi(190,86);
        ImieNazwisko imieNazwisko = new ImieNazwisko("Alan", "Luszczak");

        mb.setWaga(65);
        mb.setWzrost(178);
        System.out.println("BMI = " + mb.mojeBmi());
    }

    public static void obliczanieBMI(){
        Scanner sc = new Scanner(System.in);
        int wzrost = 0;
        int waga = 0;
        
        System.out.print("Program oblicza BMI dla podanego wzrostu w cm i wagi w kg\n"
        + "0 - zakoncz\n"
        + "1 - oblicz\n"
        + "Wybor: ");

        int zakoncz = sc.nextInt();
        while(zakoncz != 0){
            System.out.print("Podaj wzrost w kg: ");
            wzrost = sc.nextInt();

            System.out.print("Podaj wage w cm: ");
            waga = sc.nextInt();

            MojeBmi mb = new MojeBmi(wzrost, waga);
            System.out.println("BMI: "+mb.mojeBmi());
        }   
    }
}