public class Samochod extends Pojazd{
    protected String nadwozie;

    public Samochod() {
        super();
        this.nadwozie = "Sedan";
    }

    public Samochod(String nadwozie) {
        this.nadwozie = nadwozie;
    }

    public Samochod(String marka, String nazwa, int liczbaKol, boolean czySpalinowy, String nadwozie) {
        super(marka, nazwa, liczbaKol, czySpalinowy);
        this.nadwozie = nadwozie;
    }

    @Override
    protected int policzKola() {
        return super.policzKola() + 2; //ale czy musi miec sens?
    }

    @Override
    public String toString() {
        return "Samochod{" +
                super.toString() +
                "nadwozie='" + nadwozie + '\'' +
                '}';
    }
}
