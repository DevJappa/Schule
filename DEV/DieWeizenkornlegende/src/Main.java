import java.util.Scanner;

void main() {
    Scanner s = new Scanner(System.in);

    System.out.print("Gebe deine gewueschte Feldnummer ein: ");
    int feldNummer = s.nextInt();

    System.out.print("Gebe deine schaetzung ein: ");
    float gewichtGeschaetzt = Float.parseFloat(s.next().replace(",", "."));

    System.out.println(feldNummer);
    System.out.println(gewichtGeschaetzt);


    double anzahlKoerner = Math.pow(2, feldNummer - 1);

    System.out.println(anzahlKoerner);
}
