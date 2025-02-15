/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodepolimorfisme;

/**
 *
 * @author 
 */
class AlatMusik {
    // Overloading metode mainkan
    void mainkan() {
        System.out.println("Memainkan alat musik umum.");
    }

    void mainkan(String namaAlat) {
        System.out.println("Memainkan " + namaAlat + ".");
    }

    void mainkan(String namaAlat, int volume) {
        System.out.println("Memainkan " + namaAlat + " dengan volume " + volume + ".");
    }

    void mainkn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class OverLoading {
    public static void main(String[] args) {
        AlatMusik alat = new AlatMusik();

        alat.mainkan();                          // Memainkan alat musik umum
        alat.mainkan("Gitar");                   // Memainkan Gitar
        alat.mainkan("Piano", 80);               // Memainkan Piano dengan volume 80
    }
}
