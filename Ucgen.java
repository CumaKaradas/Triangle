import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dik üçgenin iki kenar uzunluğunu girin:");

        System.out.print("Kenar a: ");
        double kenarA = scanner.nextDouble();

        System.out.print("Kenar b: ");
        double kenarB = scanner.nextDouble();

        // Hipotenüsü hesapla
        double hipotenus = Math.sqrt(Math.pow(kenarA, 2) + Math.pow(kenarB, 2));

        System.out.println("Dik üçgenin hipotenüsü: " + hipotenus);

        scanner.close();
    }
}

// Pisagor teoremi matematiksel olarak şu şekildedir:
// c^2 = a^2 + b^2
// Burada:
// c hipotenüsün uzunluğunu,
// a ve b ise dik üçgenin diğer iki kenarının uzunluklarını temsil eder.
// Dolayısıyla, eğer dik üçgenin diğer iki kenarının uzunluklarını biliyorsanız,
// hipotenüsün uzunluğunu bulmak için bu formülü kullanabilirsiniz.
