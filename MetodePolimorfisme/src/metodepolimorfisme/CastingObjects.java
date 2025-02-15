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
class AlatMusikCO {
    // Metode umum untuk memainkan alat musik
    void mainkan() {
        System.out.println("Memainkan alat musik umum.");
    }
}

class GitarCO extends AlatMusikCO {
    @Override
    void mainkan() {
        System.out.println("Memainkan suara Gitar.");
    }
}

class PianoCO extends AlatMusikCO {
    @Override
    void mainkan() {
        System.out.println("Memainkan suara Piano.");
    }
}

class DrumCO extends AlatMusikCO {
    @Override
    void mainkan() {
        System.out.println("Memainkan suara Drum.");
    }
}
public class CastingObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        AlatMusikCO alat1 = new GitarCO();  // Alat musik Gitar
        AlatMusikCO alat2 = new PianoCO();  // Alat musik Piano
        AlatMusikCO alat3 = new DrumCO();   // Alat musik Drum
        
        // Menggunakan instanceof dan casting untuk memanggil metode yang tepat
        if (alat1 instanceof GitarCO) {
            GitarCO gitar = (GitarCO) alat1;  // Casting objek AlatMusik ke tipe Gitar
            gitar.mainkan();  // Memanggil metode mainkan pada Gitar
        }

        if (alat2 instanceof PianoCO) {
            PianoCO piano = (PianoCO) alat2;  // Casting objek AlatMusik ke tipe Piano
            piano.mainkan();  // Memanggil metode mainkan pada Piano
        }

        if (alat3 instanceof DrumCO) {
            DrumCO drum = (DrumCO) alat3;  // Casting objek AlatMusik ke tipe Drum
            drum.mainkan();  // Memanggil metode mainkan pada Drum
        }
        
        // Menggunakan casting eksplisit tanpa instanceof (pastikan tipe objek cocok)
        AlatMusikCO alat4 = new GitarCO();
        GitarCO gitar = (GitarCO) alat4;  // Explicit casting
        gitar.mainkan();  // Memanggil metode mainkan pada Gitar
    }
    
}
