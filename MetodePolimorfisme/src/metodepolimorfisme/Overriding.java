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
class AlatMusik1 {
    // Metode yang dapat di-override
    void mainkan() {
        System.out.println("Alat musik sedang dimainkan.");
    }
}

class Gitar extends AlatMusik {
    @Override
    void mainkan() { // Override metode mainkan
        System.out.println("Memainkan gitar dengan chord.");
    }
}

class Drum extends AlatMusik {
    @Override
    void mainkan() { // Override metode mainkan
        System.out.println("Memainkan drum dengan ritme.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        AlatMusik alat;

        alat = new Gitar();
        alat.mainkan(); // Output: Memainkan gitar dengan chord.

        alat = new Drum();
        alat.mainkan(); // Output: Memainkan drum dengan ritme.
    }
}

