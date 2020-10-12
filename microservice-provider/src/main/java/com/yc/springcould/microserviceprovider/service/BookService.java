package com.yc.springcould.microserviceprovider.service;


import com.yc.springcloud812.microserviceapi.bean.Book;

import java.util.List;

public interface BookService {
    public Book getBook(Integer id);

    public List<Book> findAll();
}