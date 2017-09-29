package com.wwg.dto;

import com.wwg.entity.TeachBook;

import java.util.List;

/**
 * Created by wwg on 2017/9/22.
 */
public class TeachBookDto extends PageDto{

    private Integer bookId;
    private String bookName;
    private String bookNo;
    private String bookCountry;
    private String publisher;
    private List<TeachBook> books;

    public List<TeachBook> getBooks() {
        return books;
    }

    public void setBooks(List<TeachBook> books) {
        this.books = books;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookCountry() {
        return bookCountry;
    }

    public void setBookCountry(String bookCountry) {
        this.bookCountry = bookCountry;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public static TeachBook form(TeachBookDto dto){
        TeachBook teachBook = null;
        if (dto != null){
            teachBook = new TeachBook();
            teachBook.setBookCountry(dto.getBookCountry());
            teachBook.setBookId(dto.getBookId());
            teachBook.setBookName(dto.getBookName());
            teachBook.setBookNo(dto.getBookNo());
            teachBook.setPublisher(dto.getPublisher());
        }
        return teachBook;
    }

    public static List<TeachBook> formList(TeachBookDto dto){
        List<TeachBook> books = null;
        if(dto != null){
            books = dto.getBooks();
        }
        return books;
    }
}
