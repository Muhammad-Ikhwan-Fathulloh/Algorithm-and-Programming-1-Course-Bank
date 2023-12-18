class ProgramKu{

    // ini variabel global
    static String nama = "Programku";
    static String version = "1.0.0";

    static void help(){

        // ini variabel lokal
        String nama = "Kang Tekno";

        // mengakses variabel global di dalam fungsi help()
        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);
    }

    public static void main(String args[]){
        
        // panggil fungsi help()
        help();
        
        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);

    }

}