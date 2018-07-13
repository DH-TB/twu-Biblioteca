package com.example.twu.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Data {
    public static List<Book> saveBookList() {
        List result = new ArrayList();
        result.add(new Book( 1, "Java", "TWU", "2018/3/16", "人民邮电出版社"));
        result.add(new Book( 2, "TDD", "TWU", "2018/3/16", "人民邮电出版社"));
        result.add(new Book( 3, "Refactor", "TWU", "2018/3/16", "人民邮电出版社"));
        result.add(new Book( 4, "Pair Programing", "TWU", "2018/3/16", "人民邮电出版社"));
        result.add(new Book( 5, "Code Small", "TWU", "2018/3/16", "人民邮电出版社"));
        return result;
    }

    public static String getBookInfoList() {
        String template = "%1$d | %2$s | %3$s | %4$s | %5$s\n";
        return saveBookList().stream().map(book -> String.format(template,
                book.getId(),
                book.getName(),
                book.getAuthor(),
                book.getYear(),
                book.getPublication())).collect(Collectors.joining());
    }

    public static String checkoutBookById(int id){
        List<Book> bookList = saveBookList().stream().filter(book->book.getId()==id).collect(Collectors.toList());
        if(bookList.size()>0){
            return "Thank you! Enjoy the book";
        }
        return "That book is not available";
    }
}
