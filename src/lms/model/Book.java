/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms.model;
public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookCategory;
    private byte[] picture;
    
    public Book(int bookId, String bookName, String bookAuthor,String bookCategory, byte[] picture){
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.picture = picture;
    }
    
    public int getBookId(){
        return bookId;
    }
    
    public String getBookName(){
        return bookName;
    }
    public String getBookAuthor(){
        return bookAuthor;
    }
    public String getBookCategory(){
        return bookCategory;
    }
    public byte[] getPicture(){
        return picture;
    }
            
}
