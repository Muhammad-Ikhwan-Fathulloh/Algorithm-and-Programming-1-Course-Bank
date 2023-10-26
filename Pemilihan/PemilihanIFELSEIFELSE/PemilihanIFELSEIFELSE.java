import java.util.Scanner;

public class Contoh {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int bayar;

    System.out.print("Masukkan total belanja anda: ");
    bayar = input.nextInt();

    if (bayar >= 2000000) {
      System.out.println("Selamat anda mendapatkan hadiah kompor gas");
    } else if (bayar >= 1000000) {
      System.out.println("Selamat anda mendapatkan hadiah teflon");
    } else if (bayar >= 500000) {
      System.out.println("Selamat anda mendapatkan hadiah piring");
    } else {
      System.out.println("Maaf anda belum beruntung, tingkatkan belanja anda!");
    }

  }
}