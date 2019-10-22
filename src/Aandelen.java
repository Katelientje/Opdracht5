public class Aandelen {

    private String symbool = "AMZN";
    private int aantal;
    private double totaleKosten;

    public Aandelen() {
        this.symbool = symbool;
        this.aantal = aantal;
        this.totaleKosten = totaleKosten;
    }

    public String getSymbool() {
        return symbool;
    }

    public int getAantal () {
        return aantal;
    }

    public double getTotaleKosten () {
        return totaleKosten;
    }

    private void setSymbool(String symbool) {
        this.symbool = symbool;
    }

    private void setAantal(int aantal) {
        this.aantal = aantal;
        setAantal(200);
    }

    private void setTotaleKosten(double totaleKosten) {
        this.totaleKosten = totaleKosten;
        setTotaleKosten(300);
    }
}

