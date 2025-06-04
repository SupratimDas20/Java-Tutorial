package org.example;
import java.util.*;


public class LibBookCount {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n=Integer.parseInt(input.nextLine());
        LibBook[] libBook = new LibBook[n];

        for(int i=0;i<n;i++){
            String bookTitle = input.nextLine();
            String bookAuth=input.nextLine();
            int noOfCopies= Integer.parseInt(input.nextLine());
            libBook[i]= new LibBook(bookTitle,bookAuth,noOfCopies);

        }

    }
}
class LibBook{
    private String bookTitle;
    private String bookAuth;
    private int noOfCopies;

    public LibBook(String bookTitle,String bookAuth,int noOfCopies){
        this.bookTitle=bookTitle;
        this.bookAuth=bookAuth;
        this.noOfCopies=noOfCopies;
    }

//    Getters
    public String getBookTitle(){
        return bookTitle;
    }
    public String getBookAuth(){
        return bookAuth;
    }
    public int getNoOfCopies(){
        return noOfCopies;
    }

//    Setters
    public void setBookTitle(String bookTitle){
        this.bookTitle=bookTitle;
    }
    public void setBookAuth(String bookAuth){
        this.bookAuth=bookAuth;
    }
    public void setNoOfCopies(int noOfCopies){
        this.noOfCopies=noOfCopies;
    }
}