import java.util.Scanner;

public class Prostokat {
    private double dlugosc;
    private double szerokosc;
    
    // Konstruktor
    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }
    
    // Metoda do wczytania danych
    public static Prostokat wczytajDane() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość prostokąta:");
        double dlugosc = scanner.nextDouble();
        System.out.println("Podaj szerokość prostokąta:");
        double szerokosc = scanner.nextDouble();
        return new Prostokat(dlugosc, szerokosc);
    }
    
    // Metoda do obliczenia pola prostokąta
    public double obliczPole() {
        return dlugosc * szerokosc;
    }
    
    // Metoda do wyświetlenia wyniku
    public void wyswietlWynik() {
        System.out.println("Pole prostokąta o wymiarach " + dlugosc + " x " + szerokosc + " wynosi: " + obliczPole());
    }
    
    public static void main(String[] args) {
        // Wczytaj dane, oblicz pole i wyświetl wynik
        Prostokat prostokat = Prostokat.wczytajDane();
        prostokat.wyswietlWynik();
    }
}
