package com.yc.springcould.microserviceprovider.service;


import com.yc.springcloud812.microserviceapi.bean.Book;
import com.yc.springcould.microserviceprovider.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired(required = false)
    private BookMapper bookMapper;

    @Override
    public Book getBook(Integer id){
        //selectByPrimaryKey  g根据主键查
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Book> findAll() {
        return bookMapper.selectAll();
    }

}
