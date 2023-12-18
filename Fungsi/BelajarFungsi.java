class BelajarFungsi {
    
    // membuat fungsi ucapSalam()
    static void ucapSalam(){
        System.out.println("Selamat Pagi");
    }

    // membuat fungsi ucapin() dengan parameter
    static void ucapin(String ucapan){
        System.out.println(ucapan);
    }

    // membuat fungsi luasPersegi() dengan parameter dan mengembalikan nilai
    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }

    // membuat fungsi main()
    public static void main(String[] args){
        // memanggil/eksekusi fungsi ucapSalam()
        ucapSalam();

        // memanggil/eksekusi fungsi ucapin()
        ucapin("Hallo!");
        ucapin("Selamat datang di pemrograman Java");
        ucapin("Saya kira ini bagian terakhir");
        ucapin("Sampai jumpa lagi, ya!");

        // memanggil/eksekusi fungsi luasPersegi()
        System.out.println("Luas Persegi dengan panjang sisi 5 adalah " + luasPersegi(5));
    }
}