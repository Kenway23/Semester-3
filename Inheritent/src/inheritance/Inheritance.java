/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Rifki
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wolf.Nama();
        Animal.sleep();
        
    }
  }
    
    class Animal{
        static void sleep(){ 
            System.out.println("I Can Sleep");
        }
    }
    
    class Wolf extends Animal {
        static void Nama() {
            System.out.println("Nama Serigalanya : Husky ");
        }
    }
    
       
