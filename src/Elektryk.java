public class Elektryk extends Samochod{
    protected int pojemnosc;

    public Elektryk() {
        super();
        this.pojemnosc = 1000;
    }

    public Elektryk(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public Elektryk(String marka, String nazwa, int liczbaKol, boolean czySpalinowy, String nadwozie, int pojemnosc) {
        super(marka, nazwa, liczbaKol, czySpalinowy, nadwozie);
        this.pojemnosc = pojemnosc;
    }

    @Override
    protected int policzKola() {
        return super.policzKola()+2;
    }

    @Override
    public String toString() {
        return "Elektryk{" +
                "pojemnosc=" + pojemnosc +
                ", marka='" + marka + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", liczbaKol=" + liczbaKol +
                ", nadwozie='" + nadwozie + '\'' +
                '}';
    }
}
