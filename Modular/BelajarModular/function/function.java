public class function {
   // membuat fungsi ucapSalam()
    public static void ucapSalam(){
        System.out.println("Selamat Pagi");
    }

    // membuat fungsi ucapin() dengan parameter
    public static void ucapin(String ucapan){
        System.out.println(ucapan);
    }

    // membuat fungsi luasPersegi() dengan parameter dan mengembalikan nilai
    public static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
}