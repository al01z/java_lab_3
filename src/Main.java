import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        Punkt punktA = new Punkt(7);
        System.out.printf(punktA.toString() + "\n");
        punktA = new Punkt(1,2,3);
        System.out.printf(punktA.toString() + "\n");
        punktA.setPx(3);
        punktA.setpY(4);
        punktA.setpZ(5);
        System.out.printf(punktA.toString() + "\n");
        System.out.printf("x = %d, y = %d, z = %d\n", punktA.getPx(), punktA.getpY(), punktA.getpZ());
        System.out.printf("1. Suma = %d, Roznica1 = %d, Roznica2 (3,4,5) = %d\n", punktA.suma(), punktA.roznica(), punktA.roznica(3,4,5));



    }
}
