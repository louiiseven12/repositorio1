package com.example.models;

import java.util.Objects;

public class book {

    private int codeBook;
    private String nombreBook;
    private String categoryBook;
    private int numPages;
    private String author;
    private String editorial;
    private boolean prestado;

    public book(int codeBook, String nombreBook, String categoryBook, int numPages, String author, String editorial, boolean prestado){
        this.codeBook=codeBook;
        this.nombreBook=nombreBook;
        this.categoryBook=categoryBook;
        this.numPages=numPages;
        this.author=author;
        this.editorial=editorial;
        this.prestado=prestado;
    }
    public book(){};

    //metodos getter y setter.
    public int getCodeBook() {
        return codeBook;
    }
    public void setCodeBook(int codeBook) {
        this.codeBook = codeBook;
    }

    public String getNombreBook() {
        return nombreBook;
    }
    public void setNombreBook(String nombreBook) {
        this.nombreBook = nombreBook;
    }

    public String getCategoryBook() {
        return categoryBook;
    }
    public void setCategoryBook(String categoryBook) {
        this.categoryBook = categoryBook;
    }

    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isPrestado() {
        return prestado;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        book book = (book) o;
        return codeBook == book.codeBook && numPages == book.numPages && prestado == book.prestado && Objects.equals(nombreBook, book.nombreBook) && Objects.equals(categoryBook, book.categoryBook) && Objects.equals(author, book.author) && Objects.equals(editorial, book.editorial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeBook, nombreBook, categoryBook, numPages, author, editorial, prestado);
    }

    @Override
    public String toString() {
        return "book{" +
                "codeBook=" + codeBook +
                ", nombreBook='" + nombreBook + '\'' +
                ", categoryBook='" + categoryBook + '\'' +
                ", numPages=" + numPages +
                ", author='" + author + '\'' +
                ", editorial='" + editorial + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
