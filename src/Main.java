
public class Main {
    public static void main(String[] args) {

        String przedmiot = "PAM";
        int rok = 2023;

        //drukowanie tekstu
        System.out.println("Witaj w Java zadanie1");
        //drukowanie liczb w konsoli
        System.out.println(23.7);
        System.out.print("liczenie: 0");
        //print jet bez entera
        //2. operacje matematyczne
        System.out.println(3+8*5);
        //.3 zmienne String, char, int, float zmiennoprzecinkowa, bool
        System.out.println("moj przedmiot " + przedmiot + " w roku " + rok);
        //biblioteka jakas matematyczna
        System.out.println(Math.max(5,10));
        System.out.println("------------------------------");
        //4 instrukcje warunkowe - if
        if (rok < 2023){
            System.out.println("rok jest mniejszy niz 2023");
        } else{
            System.out.println("rok jest wiekszy lub rowny 2023");
        }
        //switch
        switch (rok){
            case 2000:
                System.out.println("2000");
                break;
            case 2023:
                System.out.println("2023");
            break;
            default :
                System.out.println("inny wybor");
        }
        //while
        int i = 0;
        while (i<7){
            System.out.println(i);
            i++;
        }
        //for
        for (int k = 0; k < 5; k++){
            System.out.println("liczba " + k);
        }
        //for-each
        String[] imiona={"jerzy", "waclaw", "adam", "jusek"};
        for (String p :imiona ){
            System.out.println(p);

        }
        //dostep do elementu tablicy - numerujemy od 0
        System.out.println(imiona[3]);

    }
}