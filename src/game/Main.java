package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("***********************");
        System.out.println("Witam w grze milionerzy");
        System.out.println("***********************");

        String zlaOdp = "Zła odpowiedź. Nie zdobywasz punktu";
        String dobraOdp = "Dobra odpowiedź, zdobywasz punkt! :)";

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj swoje imie: ");
        String name = scanner.next();

        System.out.println("Cześć " + name + "!! \nZagramy dzisiaj o milion! \nOd wygranej dzieli Cię 5 pytań! ");
        System.out.println("\nWpisz numer z poprawną odpowiedzią: \n");


        File file = new File("");
        File file1 = new File("pytanie1.txt");
        File file2 = new File("pytanie2.txt");
        File file3 = new File("pytanie3.txt");
        File file4 = new File("pytanie4.txt");
        File file5 = new File("pytanie5.txt");
        File file6 = new File("pytanie6.txt");
        File file7 = new File("pytanie7.txt");
        File file8 = new File("pytanie8.txt");
        


        int odpowiedz = 0;
        int proba = 0;
        int goodAnswer = 0;

        while (proba < 5) {
            int random = (int) (Math.random() * 8 + 1);

            if (random == 1) {
                file = file1;
            } else if (random == 2) {
                file = file2;
            } else if (random == 3) {
                file = file3;
            } else if (random == 4) {
                file = file4;
            } else if (random == 5) {
                file = file5;
            } else if (random == 6) {
                file = file6;
            } else if (random == 7) {
                file = file7;
            } else if (random == 8) {
                file = file8;
            }

            Scanner scanner1 = new Scanner(file);


            for (int i = 0; i < 6; i++) {
                if (i < 5) {
                    String pytanie = scanner1.nextLine();
                    System.out.println(pytanie);
                } else {
                    odpowiedz = scanner1.nextInt();
                }
            }
            System.out.println("Podaj odpowiedź: ");

            int odp = scanner.nextInt();
            if (odp == odpowiedz) {
                System.out.println(dobraOdp);
                goodAnswer++;
            } else {
                System.out.println(zlaOdp);
            }

            proba++;
            System.out.println();
        }


        System.out.println("Ilość Twoich poprawnych odpowiedzi " + name + " to " + +goodAnswer);

        if (goodAnswer == 5) {
            System.out.println("Wygrałaś/eś byś milion, ale niestety tyle nie mam, mogę za to dać buziaka :*");
        }
    }
}

class testy {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("");
        File file1 = new File("pytanie6.txt");
        File file2 = new File("pytanie7.txt");
        File file3 = new File("pytanie8.txt");


        int random = (int) (Math.random() * 3 + 1);

        if (random == 1) {
            file = file1;
        } else if (random == 2) {
            file = file2;
        } else if (random == 3) {
            file = file3;
        }


        //boolean exists = file.exists();
        //System.out.println(exists);

        Scanner scanner = new Scanner(file);
        Scanner scanner1 = new Scanner(System.in);

        int odpowiedz = 0;

        for (int i = 0; i < 6; i++) {
            if (i < 5) {
                String pytanie = scanner.nextLine();
                System.out.println(pytanie);
            } else {
                odpowiedz = scanner.nextInt();
                System.out.println("Poprawna odp to: " + odpowiedz);
            }
        }
        System.out.println("Podaj odpowiedź: ");
        int odp = scanner1.nextInt();
        if (odp == odpowiedz) {
            System.out.println("Dobrze");
        } else {
            System.out.println("Zle");
        }


    }
}



