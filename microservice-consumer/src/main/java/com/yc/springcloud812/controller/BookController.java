package com.yc.springcloud812.controller;


import com.yc.springcloud812.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class BookController {
    private final static String url="http://localhost:8888/book/";
    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private HttpHeaders httpHeaders;

    @GetMapping("{id}")
    public Book getBook(@PathVariable("id") Integer id){
        //return restTemplate.getForObject(URL+id,Book.class);
        //   HttpEntity(    MultiValueMap)   ,    HttpHeaders: MultiValueMap
        //   返回: ResponseEntity


        return restTemplate.exchange( url+id, HttpMethod.GET, new HttpEntity<Object>(  httpHeaders   ), Book.class ).getBody();
    }

    @GetMapping("/findAll")
    public List<Book> findAll( ){
        // return restTemplate.getForObject(URL+"findAll",   List.class);
        return restTemplate.exchange(url+"findAll",HttpMethod.GET, new HttpEntity<Object>(  httpHeaders ), List.class).getBody();
    }

}