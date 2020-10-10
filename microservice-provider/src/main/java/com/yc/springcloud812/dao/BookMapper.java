package com.yc.springcloud812.dao;


import com.yc.springcloud812.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper    //tk.mybatis根据接口自动生成实现类
public interface BookMapper extends MisBaseMapper<Book>{
}
