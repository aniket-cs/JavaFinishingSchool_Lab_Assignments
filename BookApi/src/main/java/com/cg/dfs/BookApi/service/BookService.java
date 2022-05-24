package com.cg.dfs.BookApi.service;

import com.cg.dfs.BookApi.model.Book;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface BookService {

    // Save operation
    Book saveBook(Book book) throws JsonProcessingException;

    // Read operation
    List<Book> getBook() throws JsonProcessingException;
}
