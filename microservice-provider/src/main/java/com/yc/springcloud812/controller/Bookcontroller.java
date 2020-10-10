package com.yc.springcloud812.controller;


import com.yc.springcloud812.domain.Book;
import com.yc.springcloud812.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class Bookcontroller {

    //注入service
    @Autowired
    private BookService bookservice;

    @GetMapping("{id}")
    public Book getBook(@PathVariable("id") Integer id){

        return bookservice.getBook(id);
    }
    @GetMapping("findAll")
    public List<Book> findAll(){
        return this.bookservice.findAll();
    }

}
