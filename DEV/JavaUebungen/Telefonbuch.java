public class Telefonbuch {

    // Eigenschaften
 
    // Anfang Variablen

    public String name;

    public String telefonnummer;

    // Ende Variablen
 
    // Konstruktor

    public Telefonbuch(String name, String telefonnummer) {

        System.out.println("name: " + name);

        System.out.println("telefonnummer: " + telefonnummer);

    }
 
    // Anfang Ereignisprozeduren

    // Methoden

    public String getTelefonnummer() {

        return telefonnummer;

    }
 
    public void setTelefonnummer(String pTelefonnummer) {

        telefonnummer = pTelefonnummer;

    }
 
    public String getName() {

        return name;

    }

    // Ende Ereignisprozeduren

}
 