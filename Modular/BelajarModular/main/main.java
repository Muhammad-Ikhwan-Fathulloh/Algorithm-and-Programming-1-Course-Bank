import function.function;

class BelajarFungsi {
    static function functions = new function();

    // membuat fungsi main()
    public static void main(String[] args){
        // memanggil/eksekusi fungsi ucapSalam()
        functions.ucapSalam();

        // memanggil/eksekusi fungsi ucapin()
        functions.ucapin("Hallo!");
        functions.ucapin("Selamat datang di pemrograman Java");
        functions.ucapin("Saya kira ini bagian terakhir");
        functions.ucapin("Sampai jumpa lagi, ya!");

        // memanggil/eksekusi fungsi luasPersegi()
        System.out.println("Luas Persegi dengan panjang sisi 5 adalah " + functions.luasPersegi(5));
    }
}