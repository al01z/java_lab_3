public class Pojazd {
    protected String marka;
    protected String nazwa;
    protected int liczbaKol;
    private boolean czySpalinowy;

    public Pojazd() {
        this.marka = "";
        this.nazwa = "";
        this.liczbaKol = 4;
        this.czySpalinowy = true;
    }

    public Pojazd(String marka, String nazwa, int liczbaKol, boolean czySpalinowy) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.liczbaKol = liczbaKol;
        this.czySpalinowy = czySpalinowy;
    }

    protected int policzKola() {
        return this.liczbaKol;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "marka='" + marka + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", liczbaKol=" + liczbaKol +
                ", czySpalinowy=" + czySpalinowy +
                '}';
    }
}
