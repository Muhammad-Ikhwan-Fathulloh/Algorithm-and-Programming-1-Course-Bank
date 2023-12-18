public class BangunRuang {

    public static void main(String[] args) {
        int s = 12;
        int luas = luasKubus(s);

        System.out.println(luas);
    }

    // membuat fungsi luasPersegi()
    static int luasPersegi(int sisi){
        return sisi * sisi;
    }

    // membuat fungsi luasKubus()
    static int luasKubus(int sisi){
        
        // memanggil fungsi luasPersegi
        return 6 * luasPersegi(sisi);
    }

}