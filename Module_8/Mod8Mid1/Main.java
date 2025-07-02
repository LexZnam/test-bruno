package com.Brunoyam.Module_8.Mod8Mid1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(100);

        Material bookWarAndPeace = new Book("War and Peace");

        library.addMaterial(bookWarAndPeace);

        library.findMaterial("War and Peace");

        library.totalBookInLibrary();

        library.removeMaterial(bookWarAndPeace);

        library.totalBookInLibrary();

    }
}
