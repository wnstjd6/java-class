package day05;

import java.util.ArrayList;

class Book{
    private ArrayList<Book>books;
        String name;
        String author;
        String ISBN;
        String publisher;
        String genre;
        int copies;


        public Book(String name, String author, String ISBN, String publisher, String genre, int copies){
            this.name = name;
            this.author = author;
            this.ISBN  = ISBN;
            this.publisher = publisher;
            this.genre = genre;
            this.copies = copies;
        }
        public void showMain(){

        }
}
public class MainEntry {
    public static void main(String[] args){

    }
}
