package com.cg.dfs.BookApi.controller;

import com.cg.dfs.BookApi.model.Book;
import com.cg.dfs.BookApi.service.BookService;
import com.cg.dfs.BookApi.util.FieldErrorMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController

public class BookController {

    @Autowired
    private BookService bookService;


    Logger logger = LoggerFactory.getLogger(BookController.class);




    // Save operation
    @PreAuthorize("hasRole('ADMIN')")
    @SneakyThrows
    @PostMapping("/book/add")
    public Book saveBook(@Valid @RequestBody Book book)  {

        logger.trace("....ADD METHOD ACCESSED SUCCESSFULLY....");
        return bookService.saveBook(book);
    }



    // Read operation
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @SneakyThrows
    @GetMapping("/book/get")
    public List<Book> getBook() {

        logger.trace("....GET METHOD ACCESSED SUCCESSFULLY....");
        return bookService.getBook();
    }



    // Exception Handling
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    List<FieldErrorMessage> exceptionHandler(MethodArgumentNotValidException e){
       List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
       List<FieldErrorMessage> fieldErrorMessages = fieldErrors.stream()
               .map(fieldError -> new FieldErrorMessage(fieldError.getField(), fieldError.getDefaultMessage()))
               .collect(Collectors.toList());

        logger.trace("....SOME EXCEPTION HAPPENED....");

       return fieldErrorMessages;

    }





}
