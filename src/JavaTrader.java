public class JavaTrader {

    public static void main(String[] args) {
        Aandelen amazon = new Aandelen();
        Aandelen oracle = new Aandelen();

        oracle.getSymbool();


        System.out.println("Aandelen: " + " symbool = " + amazon.getSymbool() + " aantal = " + amazon.getAantal() + " totale kosten = " + amazon.getTotaleKosten());
        System.out.println("Aandelen: " + " symbool = " + oracle.getSymbool() + " aantal = " + oracle.getAantal() + " totale kosten = " + oracle.getTotaleKosten());
    }
}


