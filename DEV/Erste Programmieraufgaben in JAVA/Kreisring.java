import java.util.Scanner;

public class Kreisring
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        // Auswahl der Berechnung
        
        System.out.println("Gebe den Radius ein: ");
        int radius = s.nextInt();
        
        double A = (Math.PI * (radius * radius));
        
        System.out.println("----Ergebniss----");
        System.out.println("Der Flaecheninhalt betraegt:" + A + "cm\u00B2");
    }
}
