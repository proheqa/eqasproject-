
import java.util.Scanner;

public class ImpianSaya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Siapa nama anda? ");
        String nama = input.nextLine();

        System.out.print("Apakah cita-cita anda? ");
        String citaCita = input.nextLine();

        System.out.print("Apakah harapan anda di masa hadapan? ");
        String harapan = input.nextLine();

        System.out.println("\n--- Maklumat Pengguna ---");
        System.out.println("Nama: " + nama);
        System.out.println("Cita-cita: " + citaCita);
        System.out.println("Harapan masa depan: " + harapan);
    }
}
