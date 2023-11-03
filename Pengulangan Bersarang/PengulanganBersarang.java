public class NestedLoopExample {

    public static void main(String[] args) {
        int tinggiSegitiga = 5; // Ubah nilai ini sesuai dengan tinggi segitiga yang diinginkan

        for (int i = 1; i <= tinggiSegitiga; i++) {
            // Cetak spasi sebelum bintang
            for (int j = tinggiSegitiga - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            // Cetak bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
