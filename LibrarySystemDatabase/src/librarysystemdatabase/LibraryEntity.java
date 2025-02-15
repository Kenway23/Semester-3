/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystemdatabase;

/**
 *
 * @author Rifki
 */
public abstract class LibraryEntity {
    private int id;

    public LibraryEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public abstract String getDetails(); // Polymorphism
}