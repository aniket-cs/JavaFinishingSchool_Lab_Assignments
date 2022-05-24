package com.cg.dfs.Student.controller;

import com.cg.dfs.Student.model.Book;
import com.cg.dfs.Student.service.BookRestConsumer;
import com.netflix.discovery.converters.Auto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {

    @Autowired
    private BookRestConsumer consumer;

    Logger logger = LoggerFactory.getLogger(StudentRestController.class);

    @GetMapping("/allBooks")
    public List<Book> getAllBooks() {

        logger.trace("....BOOK REST ENDPOINT FETCHED SUCCESSFULLY....");
        return consumer.getBook();
    }


}
