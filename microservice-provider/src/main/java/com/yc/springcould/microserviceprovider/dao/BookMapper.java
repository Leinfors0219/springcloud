package com.yc.springcould.microserviceprovider.dao;

import com.yc.springcloud812.microserviceapi.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper    //tk.mybatis根据接口自动生成实现类
public interface BookMapper extends MisBaseMapper<Book>{
}
