package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        int a;

        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        while (a != 0) {

            switch (a) {

                case 1:
                    System.out.println("Styczeń");
                    break;
                case 2:
                    System.out.println("Luty");
                    break;
                case 3:
                    System.out.println("Marzec");
                    break;
                case 4:
                    System.out.println("Kwiecień");
                    break;

                case 5:
                    System.out.println("Maj");
                    break;
                case 6:
                    System.out.println("Czerwiec");
                    break;
                case 7:
                    System.out.println("Lipiec");
                    break;
                case 8:
                    System.out.println("Sierpień");
                    break;
                case 9:
                    System.out.println("Wrzesień");
                    break;
                case 10:
                    System.out.println("Październik");
                    break;
                case 11:
                    System.out.println("Listopad");
                    break;
                case 12:
                    System.out.println("Grudzień");
                    break;

                default:
                    System.out.println("Zły miesiac");
                    break;

            }
            a = s.nextInt();
        }

        int i = 0;
        int b = 0;
        int skok = 1;

        do {
            a += skok;
            i += 1;
            System.out.println("a = " + a);
            System.out.println("obieg petli numer " + (i));
        } while (a < 1000);
        b = 0;
        i = 0;
        while (a < 1000) {
            a += skok;
            i += 1;

        }

        for (int c = 0; c <= 20; c++) {
            if (c == 2 || c == 6 || c == 9 || c == 15 || c == 19) {
                continue;
            }
            System.out.println(c);
        }

        
        int m,n,o;
        float delta;
         m= s.nextInt();
         n= s.nextInt();
         o= s.nextInt();
         
        
    }

}
