import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.imie = "Adam";
        student1.nazwisko = "Kowalski";
        student1.indeks = 1;
        student1.aktywny = true;
        studentList.add(student1);
        Student student2 = new Student();
        student2.imie = "Krzysztof";
        student2.nazwisko = "Nowak";
        student2.indeks = 2;
        student2.aktywny = true;
        studentList.add(student2);
        Student student3 = new Student();
        student3.imie = "Kuba";
        student3.nazwisko = "Trojanowski";
        student3.indeks = 3;
        student3.aktywny = true;
        studentList.add(student3);
        for (Student s : studentList) {
            System.out.println(s.imie + " " + s.nazwisko + ", numer indeksu: " + s.indeks + ", aktywny: " + s.aktywny);
        }
    }

}
