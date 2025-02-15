/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodepolimorfisme;
/**
 *
 * @author Rifki
 */
class AlatMusik2 {
        void mainkan() {
            System.out.println("Memainkan alat musik umum.");
        }
    }
    
    class Gitar1 extends AlatMusik {
        @Override
        void mainkan() {
            System.out.println("Memainkan suara Gitar.");
        }
    }
    
    class Piano2 extends AlatMusik {
        @Override
        void mainkan() {
            System.out.println("Memainkan suara Piano.");
        }
    }
    
    class Drum2 extends AlatMusik {
        @Override
        void mainkan() {
            System.out.println("Memainkan suara Drum.");
        }
    }
public class instanceofStatements {

    /**
     * @param args the command line arguments
     */    
public static void main(String[] args) {
      AlatMusik alat1 = new Gitar1();
        AlatMusik alat2 = new Piano2();
        AlatMusik alat3 = new Drum2();
        
        // Menggunakan instanceof untuk memeriksa jenis objek
        if (alat1 instanceof Gitar1) {
            System.out.println("Memainkan Gitar");
            alat1.mainkan();  // Memainkan Gitar
        }
        if (alat2 instanceof Piano2) {
            System.out.println("Memainkan Piano dengan volume 80");
            alat2.mainkan();  // Memainkan Piano
        }
        if (alat3 instanceof Drum2) {
            System.out.println("Memainkan Drum dengan volume 50");
            alat3.mainkan();  // Memainkan Drum
        }

        // Atau, kita bisa menggunakan metode mainkan biasa
        alat1.mainkan();  // Memainkan alat musik umum
        alat2.mainkan();  // Memainkan alat musik umum
        alat3.mainkan();  // Memainkan alat musik umum
      // TODO code application logic here
    }
    
}
