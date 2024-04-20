import java.util.Scanner;

public class SprawdzanieTrojkata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pobierz długości boków od użytkownika
        System.out.println("Podaj długości trzech odcinków: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        // Sprawdź warunek trójkąta
        if (czyMoznaUtworzycTrojkat(a, b, c)) {
            // Określ typ trójkąta
            if (czyTrojkatRownoboczny(a, b, c)) {
                System.out.println("Trójkąt równoboczny");
            } else if (czyTrojkatRownoramienny(a, b, c)) {
                System.out.println("Trójkąt równoramienny");
            } else {
                System.out.println("Trójkąt różnoboczny");
            }
        } else {
            System.out.println("Z podanych długości nie można utworzyć trójkąta");
        }
        
        // Zamknij scanner
        scanner.close();
    }
    
    // Metoda sprawdzająca warunek trójkąta
    public static boolean czyMoznaUtworzycTrojkat(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    
    // Metoda sprawdzająca czy trójkąt jest równoboczny
    public static boolean czyTrojkatRownoboczny(double a, double b, double c) {
        return a == b && b == c;
    }
    
    // Metoda sprawdzająca czy trójkąt jest równoramienny
    public static boolean czyTrojkatRownoramienny(double a, double b, double c) {
        return a == b || a == c || b == c;
    }
}
