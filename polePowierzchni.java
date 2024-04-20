import java.util.Scanner;

public class PolePowierzchniProstokata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pobierz długość pierwszego boku od użytkownika
        System.out.print("Podaj długość pierwszego boku prostokąta: ");
        double bokA = scanner.nextDouble();
        
        // Pobierz długość drugiego boku od użytkownika
        System.out.print("Podaj długość drugiego boku prostokąta: ");
        double bokB = scanner.nextDouble();
        
        // Oblicz pole prostokąta
        double pole = bokA * bokB;
        
        // Wyświetl wynik
        System.out.println("Pole powierzchni prostokąta o bokach " + bokA + " i " + bokB + " wynosi: " + pole);
        
        // Zamknij scanner
        scanner.close();
    }
}
