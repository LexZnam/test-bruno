package com.Brunoyam.Module_8.Mod8Mid1;

public abstract class Material {
    public Material(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    String title;
}

class Book extends Material {
    public Book(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return "book";
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }
}

class Magazine extends Material {
    public Magazine(String title) {
        super(title);
    }

}

class Newspaper extends Material {
    public Newspaper(String title) {
        super(title);
    }
}

class Article extends Material {
    public Article(String title) {
        super(title);
    }
}
