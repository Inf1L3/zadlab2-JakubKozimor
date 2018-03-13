/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author Jakub
 */
public class Zadaniedomowe {

    public static void main(String[] args) {
        Scanner pobierz = new Scanner(System.in);
        System.out.println("Podaj numer zadania 1-7     0-zakończ");
        int nr = pobierz.nextInt();
        while (nr != 0) {
            switch (nr) {
                case 1: {
                    System.out.println("Podaj 3 liczby");
                    double a = pobierz.nextFloat();
                    double b = pobierz.nextFloat();
                    double c = pobierz.nextFloat();
                    System.out.println(a + "Działanie: x^2+" + b + "x+" + c);
                    double delta = b * b - (4 * a * c);
                    System.out.println("Delta= " + delta);
                    if (delta < 0) {
                        System.out.println("Delta mniejsza od zera");
                    }
                    if (delta == 0) {
                        System.out.println("x0= " + (-b / 2 * a));
                    }
                    if (delta > 0) {
                        System.out.println("x1= " + ((-b + delta) / 2 * a) + " x2= " + ((-b - delta) / 2 * a));
                    }
                    break;

                }
                case 2: {
                    System.out.println("1-dodawanie");
                    System.out.println("2-odejmowanie");
                    System.out.println("3-mnozenie");
                    System.out.println("4-dzielenie");
                    System.out.println("5-potega");
                    System.out.println("6-pierwiastek");
                    System.out.println("7-sinus");
                    System.out.println("8-cosinus");
                    int dzialanie = pobierz.nextInt();
                    while (dzialanie != 0) {
                        switch (dzialanie) {
                            case 1: {
                                System.out.println("podaj 2 liczby");
                                double a = pobierz.nextInt();
                                double b = pobierz.nextInt();
                                System.out.println("Suma=" + (a + b));
                                break;
                            }
                            case 2: {
                                System.out.println("podaj 2 liczby");
                                double a = pobierz.nextInt();
                                double b = pobierz.nextInt();
                                System.out.println("Różnica=" + (a - b));
                                break;
                            }
                            case 3: {
                                System.out.println("podaj 2 liczby");
                                double a = pobierz.nextInt();
                                double b = pobierz.nextInt();
                                System.out.println("Iloczyn=" + (a * b));
                                break;
                            }
                            case 4: {
                                System.out.println("podaj 2 liczby");
                                double a = pobierz.nextInt();
                                double b = pobierz.nextInt();
                                System.out.println("Iloraz=" + (a / b));
                                break;
                            }
                            case 5: {
                                System.out.println("podaj liczbe i potege");
                                System.out.print("liczba=");
                                double a = pobierz.nextInt();
                                System.out.print("potega=");
                                double b = pobierz.nextInt();
                                System.out.println("a^b= " + Math.pow(a, b));
                                break;
                            }
                            case 6: {
                                System.out.println("podaj liczbe i pierwiastek");
                                System.out.print("liczba=");
                                double a = pobierz.nextInt();
                                System.out.print("pierwiastek=");
                                double b = pobierz.nextInt();
                                System.out.println("a^(1/b)= " + Math.pow(a, 1 / b));
                                break;
                            }
                            case 7: {
                                System.out.println("podaj miare kata");
                                double x = pobierz.nextDouble();
                                System.out.println("sin(x)= " + Math.sin(x));
                                break;
                            }
                            case 8: {
                                System.out.println("podaj miare kata");
                                double x = pobierz.nextDouble();
                                System.out.println("cos(x)= " + Math.cos(x));
                                break;
                            }
                            default: {
                                System.out.println("Bledne dzialanie");
                            }

                        }

                        System.out.println("jakie dzialanie wykonac?    0-wyjdz");
                        dzialanie = pobierz.nextInt();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Wprowadz 10 liczb");
                    int[] tablica = new int[10];
                    for (int i = 0; i < 10; i++) {
                        tablica[i] = pobierz.nextInt();
                    }

                    System.out.println("1-od pierwszej do ostatniej");
                    System.out.println("2-od ostatniej do pierwszej");
                    System.out.println("3-znieparzystymi indeksami ");
                    System.out.println("4-z parzysymi indeksami");
                    System.out.println("5-wyjdz");

                    int wybor;
                    do {
                        System.out.println("Jak wyswietlic?    5-wyjdz");
                        wybor = pobierz.nextInt();
                        if (wybor == 1) {
                            for (int i = 0; i < 10; i++) {
                                System.out.println(tablica[i]);
                            }
                        } else {
                            if (wybor == 2) {
                                for (int i = 9; i >= 0; i--) {
                                    System.out.println(tablica[i]);
                                }

                            } else {
                                if (wybor == 3) {
                                    for (int i = 0; i < 10; i++) {
                                        if (i % 2 == 0) {
                                            continue;
                                        }
                                        System.out.println(tablica[i]);
                                    }
                                } else {
                                    if (wybor == 4) {
                                        for (int i = 0; i < 10; i++) {
                                            if (i % 2 != 0) {
                                                continue;
                                            }
                                            System.out.println(tablica[i]);
                                        }
                                    }
                                }
                            }
                        }
                    } while (wybor != 5);

                    break;

                }
                case 4: {
                    System.out.println("Wprowadz 10 liczb");
                    int[] tablica = new int[10];
                    for (int i = 0; i < 10; i++) {
                        tablica[i] = pobierz.nextInt();
                    }
                    int suma = 0, iloczyn = 0, srednia, wmin = 1000000000, wmax = 0;

                    for (int i = 0; i < 10; i++) {
                        suma = suma + tablica[i];
                        iloczyn = iloczyn + tablica[i];
                        if (tablica[i] < wmin) {
                            wmin = tablica[i];

                        }
                        if (tablica[i] > wmax) {
                            wmax = tablica[i];
                        }

                    }
                    srednia = suma / 10;
                    System.out.println("1-Suma");
                    System.out.println("2-Iloczyn");
                    System.out.println("3-Średnia");
                    System.out.println("4-Wartość minimalna");
                    System.out.println("5-Wartość maksymalna");
                    System.out.println("0-wyjdz");
                    System.out.println("Co wyswietlic?");
                    int wybor = pobierz.nextInt();
                    while (wybor != 0) {
                        switch (wybor) {
                            case 1: {
                                System.out.println("Suma= " + suma);
                                break;
                            }
                            case 2: {
                                System.out.println("Iloczyn= " + iloczyn);
                                break;
                            }
                            case 3: {
                                System.out.println("Średnia" + srednia);
                                break;
                            }
                            case 4: {
                                System.out.println("Wartość minimalna= " + wmin);
                                break;
                            }
                            case 5: {
                                System.out.println("Wartość maxymalna= " + wmax);
                                break;
                            }
                            default: {
                                System.out.println("Błąd");
                                break;
                            }
                        }
                        System.out.println("Co wyswietlic    0-wyjdz");
                        wybor = pobierz.nextInt();
                    }
                    break;
                }
                case 5: {
                    for (int c = 0; c <= 20; c++) {
                        if (c == 2 || c == 6 || c == 9 || c == 15 || c == 19) {
                            continue;
                        }
                        System.out.println(c);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Wprowadzaj liczby całkowite");
                    System.out.println("Wprowadz liczbe <0 aby wyjść");
                    int liczba = 1;
                    while (liczba > 0) {
                        liczba = pobierz.nextInt();
                        System.out.println("liczba=" + liczba);
                        if (liczba < 0) {
                            break;
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Ile chcesz wprowadzic liczb?");
                    int ilosc = pobierz.nextInt();
                    int[] tablica = new int[ilosc];
                    System.out.println("Wprowadz liczby");
                    for (int i = 0; i < ilosc; i++) {
                        tablica[i] = pobierz.nextInt();
                    }
                    int czy = 1;
                    int c;

                    while (czy == 1) {
                        czy = 0;

                        for (int i = 0; i < ilosc - 1; i++) {
                            if (tablica[i] > tablica[i + 1]) {
                                c = tablica[i];
                                tablica[i] = tablica[i + 1];
                                tablica[i + 1] = c;
                                czy = 1;
                            }

                        }

                    }
                    System.out.println("Posortowane liczby");
                    for (int i = 0; i < ilosc; i++) {
                        System.out.println(tablica[i]);
                    }
                    break;
                }

            }

            System.out.println("Podaj numer zadania");
            nr = pobierz.nextInt();
        }

    }
}
