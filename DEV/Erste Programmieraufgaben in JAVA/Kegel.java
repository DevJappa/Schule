import java.util.Scanner;

public class Kegel
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double r = 5.512;
        double h = 20.421;
        
        double s = Math.sqrt((r * r) + (h * h));
        double O = Math.PI * (r * r) + Math.PI * r;
        double V = (1.00 / 3.00) * Math.PI * (r * r) * h;
        
        System.out.println("Die Seitenlinie betraegt: " + s + "cm, die Oberflaeche betraegt: " + O + " und das Volumen betraegt: " + V + "cm\u00B3");
    }
}
