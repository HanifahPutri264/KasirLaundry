import java.util.Scanner;

// Class Diskon
class Diskon {
    // Method untuk menghitung diskon berdasarkan total amount
    public static int hitungDiskon(int totalAmount) {
        // Misalnya, diskon 10% jika total amount di atas 100000
        if (totalAmount > 100000) {
            return (int) (0.1 * totalAmount);
        } else {
            return 0;
        }
    }
}
