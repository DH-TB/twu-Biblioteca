package com.example.twu.actions;

import java.util.stream.Collectors;

import static com.example.twu.Application.dataList;

public class ShowBookListAction {

    public String getBookInfoList() {
        String template = "%1$d | %2$s | %3$s | %4$s | %5$s\n";
        return dataList.getBookList().stream().map(book -> String.format(template,
                book.getId(),
                book.getName(),
                book.getAuthor(),
                book.getYear(),
                book.getPublication())).collect(Collectors.joining());
    }
}
