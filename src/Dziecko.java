public class Dziecko {

    private String imie;
    private int wiek;

    public Dziecko(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Cześć, jestem " + imie  + " i mam " + wiek + " lat(a)";
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }
}
