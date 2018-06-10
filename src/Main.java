import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        String imie;
        System.out.println("podaj swoje imię:");
        Scanner odczyt = new Scanner(System.in);
        imie = odczyt.nextLine();
        System.out.println("Cześć " + imie + "! Pięknie dziś wyglądasz :) ");
        */
        //String aaa="aaa";

        //tworzymy obiekt pierwszeDziecko typu Dziecko
        Dziecko pierwszeDziecko = new Dziecko("Kasia",7);
        System.out.println(pierwszeDziecko.toString());

        System.out.println("Imię przed zmianą: " + pierwszeDziecko.getImie());
        //ustawiamy setterem nową wartość dla zmiennej imie
        pierwszeDziecko.setImie("Katarzyna");
        System.out.println("imie po zmianie: " + pierwszeDziecko.getImie());

    }
}
