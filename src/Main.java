import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Pojazd traktor = new Pojazd("Ursus", "1021 2WD", 4, true);
        System.out.println(traktor.toString());
        System.out.println("Liczba kolek: " + traktor.policzKola() + "\n");

        Samochod alfaromeo = new Samochod("Alfa Romeo", "157", 4, true, "Sedan");
        System.out.println(alfaromeo.toString());
        System.out.println("Liczba kolek: " + alfaromeo.policzKola() + "\n");

        Elektryk tesla = new Elektryk("Tesla", "Roadster 2", 4, false, "Roadster", 2000);
        System.out.println(tesla.toString());
        System.out.println("Liczba kolek: " + tesla.policzKola() + "\n");

        Elektryk e = new Elektryk("Honda", "e", 4, false, "Hatchback", 1200);
        System.out.println(e.toString());
        System.out.println("Liczba kolek: " + e.policzKola() + "\n");

        List<Pojazd> pojazdLista = new ArrayList<>();
        pojazdLista.add(traktor);
        pojazdLista.add(alfaromeo);
        pojazdLista.add(tesla);
        pojazdLista.add(e);
        System.out.println(pojazdLista);


        Pojazd ioniq = new Elektryk("Hyundai", "Ioniq", 4, false, "Sedan", 2300);
        System.out.println("\n" + ioniq.toString());

        Pojazd passat = new Samochod("Volkswagen", "Passat", 4, true,"Kombi");
        System.out.println(passat.toString());

        Object eTron = new Pojazd("Audi", "eTron", 4, false);
        System.out.println("\n" + eTron.toString());

        eTron = new Samochod("Audi", "eTron", 4, false, "Roadster");
        System.out.println(eTron.toString());

        eTron = new Elektryk("Audi", "eTron", 4, false, "Roadster", 2000);
        System.out.println(eTron.toString());
    }
}
