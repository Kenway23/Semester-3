/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifki
 */
package metodepolimorfisme;

// Superclass
abstract class AlatMusic {
    // Metode abstrak yang akan dioverride
    abstract void mainkn();
}

// Subclass untuk alat musik spesifik
class Guitar extends AlatMusic {
    @Override
    void mainkn() {
        System.out.println("Memainkan Gitar.");
    }
}

class Drum1 extends AlatMusic {
    @Override
    void mainkn() {
        System.out.println("Memainkan Drum.");
    }
}

class Piano1 extends AlatMusic {
    @Override
    void mainkn() {
        System.out.println("Memainkan Piano.");
    }
}

// Kelas utama
public class PolymorphicArguments {
    public static void main(String[] args) {
        // Menggunakan polimorfisme untuk memainkan alat musik
        tampilkanAlatMusik(new Guitar());
        tampilkanAlatMusik(new Piano1());
        tampilkanAlatMusik(new Drum1());
    }

    // Metode dengan polymorphic arguments
    static void tampilkanAlatMusik(AlatMusic alat) {
        alat.mainkn(); // Polimorfisme terjadi di sini
    }
}
 
