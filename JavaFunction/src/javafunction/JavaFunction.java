public class JavaFunction {
   // membuat fungsi ucapSalam()
    static void ucapSalam(){
        System.out.println("Sup Homie");
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
}