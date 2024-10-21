public class Main {

    // membuat fungsi main()
    public static void main(String[] args){
        // memanggil/eksekusi fungsi ucapSalam()
        JavaFunction.ucapSalam();

        // memanggil/eksekusi fungsi ucapin()
        JavaFunction.ucapin("Hallo!");
        JavaFunction.ucapin("Selamat datang di pemrograman Java");
        JavaFunction.ucapin("Saya kira ini bagian terakhir");
        JavaFunction.ucapin("Sampai jumpa lagi, ya!");
        System.out.println("");
        System.out.println("PERHITUNGAN LUAS : ");
        // memanggil/eksekusi fungsi luasPersegi()
        System.out.println("Luas Persegi dengan panjang sisi 5 adalah " + JavaFunction.luasPersegi(5));
        System.out.println("");
        System.out.println("Luas Segitiga dengan Alas 5 dan Tinggi !2 adalah " + Rumus.Segitiga(5,12));
        System.out.println("");
        System.out.println("Keliling Pesegi Panjang dengan Panjang 10 dan Lebar !5 adalah " + Rumus.PesergiPanjang(10, 15));
    }
}