/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Rifki
 */
public class InheritanceKendaraan {

    
    public static void main(String[] args) {
        Kendaraan.infokendaraan();
        Mobil.NyalakanMesin();
        SepedaMotor.NyalakanMesin();
    } 
}

 class Kendaraan{
        static void infokendaraan(){
            System.out.println("Mobil ini beroda 4");
            System.out.println("Motor ini Rodanya 2");
            System.out.println("Kendaraan Harus Mempunyai Mesin");
        }
    }

class Mobil extends Kendaraan {
        static void NyalakanMesin() {
            System.out.println("Mesin Mobil Sedang Dinyalakan.");
        }
    }

class SepedaMotor extends Kendaraan {
    static void NyalakanMesin(){
        System.out.println("Mesin Sepeda Motor Sedang Dinyalakan.");
    }
}
