package operatory;

import javax.swing.*;

public class operatory {
    public static void main(String[] args) {

boolean dom;
        String name = "Ola";
        String nazwisko = "Kubek";
        String stanowisko = "kierownik";
        String pesel = " 334345535";
        String płeć = "M";
        double wynagrodzeniebrutto = 3000;
        double wynagrodzenienetto = 2000;
         dom = false;

        System.out.printf("%10s | %10s | %12s | %14s | %1s | %8.2fzł | %8.2fzł | %b", name, nazwisko, stanowisko, pesel, płeć, wynagrodzeniebrutto, wynagrodzenienetto, dom);
        System.out.println();


            String ulica = "Wiejska";
            String miasto = "bydgoszcz";
            String miejsce = "Wiejska" + " " + "bydgoszcz";

            String wszystko = miejsce + " " + "miejscowość";
            System.out.println(wszystko);
            System.out.println("miejsce"+" "+ miejsce.toUpperCase());
            System.out.println(miejsce.toLowerCase());
            System.out.println(wszystko.length());
            System.out.println(miejsce.charAt(2));
            System.out.println(miejsce.charAt(5));

            System.out.println(wszystko.length());
            System.out.println(wszystko.charAt(wszystko.length()-3));




    }

}



