package com.Brunoyam.Module_8.Mod8Mid1;

public class Library {

    Material[] materials;

    public Library(int size) {
        this.materials = new Material[size];
    }

    public int addMaterial(Material material) {
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] == null) {
                materials[i] = material;
                return i;
            }
        }
        return -1;
    }

    public int removeMaterial(Material material) {
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] == material) {
                System.out.println("Отдали " + materials[i].toString() + ": " + materials[i].getTitle());
                materials[i] = null;
                return i;
            }
        }
        return -1;
    }

    public void findMaterial(String title) {
        boolean find = false;
        for (int i = 0; i < materials.length; i++) {

            if (materials[i] != null && materials[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Есть " + materials[i].toString() + ": " + materials[i].getTitle());
                find = true;
            }
        }
        if (!find) {
            System.out.println("Ничего не найдено");
        }
    }

    public void totalBookInLibrary() {
        int count = 0;

        for (int i = 0; i < materials.length; i++) {
            if (materials[i] instanceof Book) {
                count++;

            }

        }
        System.out.println("Всего книг в библиотеке: " + count);
    }
}
