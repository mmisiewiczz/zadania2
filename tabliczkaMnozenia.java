public class TabliczkaMnozenia {
    public static void main(String[] args) {
        // Wyświetlanie tabliczki mnożenia dla liczb od 1 do 100
        for (int i = 1; i <= 100; i++) {
            System.out.println("Tabliczka mnożenia dla liczby " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // Pusta linia oddzielająca tabliczki mnożenia dla różnych liczb
        }
    }
}
