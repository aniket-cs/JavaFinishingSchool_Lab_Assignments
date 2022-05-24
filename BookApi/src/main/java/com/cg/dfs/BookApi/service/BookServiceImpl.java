package com.cg.dfs.BookApi.service;

import com.cg.dfs.BookApi.model.Book;
import com.cg.dfs.BookApi.repository.BookRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class BookServiceImpl implements BookService{

   // Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookRepository bookRepository;


    // Save operation
    @Override
    public Book saveBook(Book book)  {

       // logger.info("Book-Service Request : " + new ObjectMapper().writeValueAsString(book));
        return bookRepository.save(book);
    }


    // Read operation
    @Override
    public List<Book> getBook()  {

        return (List<Book>) bookRepository.findAll();
    }
}
