package com.yc.springcloud812.service;



import com.yc.springcloud812.domain.Book;

import java.util.List;

public interface BookService {
    public Book getBook(Integer id);
    public List<Book> findAll();
}
