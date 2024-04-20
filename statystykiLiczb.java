import java.util.Scanner;
import java.util.Random;

public class StatystykiLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pobierz liczbę liczb do wylosowania od użytkownika
        System.out.print("Podaj liczbę liczb do wylosowania: ");
        int n = scanner.nextInt();
        
        // Wylosuj liczby całkowite i zapisz je w tablicy
        Random random = new Random();
        int[] liczby = new int[n];
        for (int i = 0; i < n; i++) {
            liczby[i] = random.nextInt(); // losuje liczby całkowite
        }
        
        // Znajdź największą liczbę
        int max = Integer.MIN_VALUE;
        for (int liczba : liczby) {
            if (liczba > max) {
                max = liczba;
            }
        }
        
        // Znajdź najmniejszą liczbę
        int min = Integer.MAX_VALUE;
        for (int liczba : liczby) {
            if (liczba < min) {
                min = liczba;
            }
        }
        
        // Oblicz wartość średnią
        double suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }
        double srednia = suma / n;
        
        // Wyświetl wyniki
        System.out.println("Największa liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Wartość średnia: " + srednia);
        
        // Zamknij scanner
        scanner.close();
    }
}
