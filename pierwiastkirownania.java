import java.util.Scanner;

public class PierwiastkiKwadratowego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pobierz współczynniki równania od użytkownika
        System.out.println("Podaj współczynniki równania kwadratowego ax^2 + bx + c = 0:");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        
        // Oblicz deltę
        double delta = b * b - 4 * a * c;
        
        // Sprawdź, czy delta jest dodatnia, ujemna czy równa zero
        if (delta > 0) {
            // Dwa pierwiastki rzeczywiste
            double pierwiastek1 = (-b + Math.sqrt(delta)) / (2 * a);
            double pierwiastek2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Równanie ma dwa pierwiastki rzeczywiste:");
            System.out.printf("x1 = %.2f%n", pierwiastek1);
            System.out.printf("x2 = %.2f%n", pierwiastek2);
        } else if (delta == 0) {
            // Jeden podwójny pierwiastek rzeczywisty
            double pierwiastek = -b / (2 * a);
            System.out.println("Równanie ma jeden podwójny pierwiastek rzeczywisty:");
            System.out.printf("x = %.2f%n", pierwiastek);
        } else {
            // Brak pierwiastków rzeczywistych
            System.out.println("Równanie nie ma pierwiastków rzeczywistych.");
        }
        
        // Zamknij scanner
        scanner.close();
    }
}
