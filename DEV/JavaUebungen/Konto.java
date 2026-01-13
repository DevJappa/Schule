
public class Konto
{
    private String besitzerName;
    private String vorname;
    private String postleitzahl;
    private String strassenName;
    private int telefonNummer;
    private float kreditLimit;
    private double kontostand;
    
    public Konto (String pBesitzerName){
      /**
      *strassenName = pStrassenName;
      *postleitzahl = pPostleitzahl;
      *telefonNummer = pTelefonNummer;
      *vorname = pVorname;
      */
      besitzerName = pBesitzerName;
      kreditLimit = 100_000;
      kontostand = 1.0;
      
      System.out.println(einzahlen(100) + "€");
      System.out.println(auszahlen(50) + "€");
      System.out.println(bucheZinsen(3.03) + "€");
      System.out.println(getKontostand() + "€");
      
      
    }
    
    public double einzahlen(double pBetrag) {
        kontostand += pBetrag;
        return kontostand;
    }
    
    
    public double auszahlen(double pBetrag) {
        kontostand -= pBetrag;
        return kontostand;
    }
    
    
    public double bucheZinsen(double pZinssatz) {
        kontostand *= pZinssatz;
        return kontostand;
    }
    
    
    public double getKontostand() {
        return kontostand;
    }
    
    
    public void setBesitzerName(String pNeuerName){
        besitzerName = pNeuerName; 
    }
    
    
    public String getBesitzerName(){
        return besitzerName;
    }
    
    
    public void ueberweisung(double pBetrag, Konto pZielkonto) {
        auszahlen(pBetrag);
        pZielkonto.einzahlen(pBetrag);
    }
    
}
