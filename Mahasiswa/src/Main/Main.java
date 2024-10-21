package Main;

import mahasiswa.Mahasiswa;
import Matkul.MatkulNilai;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== DATA MAHASISWA ==========");
        for(int i = 0; i < Mahasiswa.NamaMahasiswa.length; i++) {
            System.out.println("Nama: " + Mahasiswa.NamaMahasiswa[i]);
            System.out.println("Kelas: " + Mahasiswa.Kelas[i]);
            System.out.println("Semester: " + Mahasiswa.Semester[i]);
            System.out.println("-----------------------");
        }
        System.out.println("");
        System.out.println("========== MATA KULIAH & GRADE NILAI ==========");
            for(int i = 0; i < MatkulNilai.Matkul.length; i++) {
            System.out.println("Matkul : " + MatkulNilai.Matkul[i]);
            
            String grade;
            if(MatkulNilai.Nilai[i] >= 85) {
                grade = "A";
            } else if(MatkulNilai.Nilai[i] >= 80) {
                grade = "B";
            } else if(MatkulNilai.Nilai[i] >= 75) {
                grade = "C";
            } else if(MatkulNilai.Nilai[i] >= 70) {
                grade = "D";
            } else {
                grade = "E";
            }
            
            System.out.println("Grade: " + grade);
            System.out.println("-----------------------------------------------");
        }
    }
}
