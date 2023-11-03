import java.util.Scanner;

public class NestedSelectionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilaiUjian = scanner.nextInt();

        if (nilaiUjian >= 60) {
            System.out.println("Anda lulus ujian.");
            
            System.out.print("Apakah Anda ingin melanjutkan ke tingkat berikutnya (y/n)? ");
            scanner.nextLine(); // Membersihkan newline
            String lanjut = scanner.nextLine();
            
            if (lanjut.equals("y")) {
                System.out.println("Selamat, Anda melanjutkan ke tingkat berikutnya.");
            } else {
                System.out.println("Terima kasih telah berpartisipasi.");
            }
        } else {
            System.out.println("Anda tidak lulus ujian.");
        }

        scanner.close();
    }
}
