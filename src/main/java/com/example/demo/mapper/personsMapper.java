package com.example.demo.mapper;

import com.example.demo.sql.persons;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface personsMapper {
    @Select("select * from persons")
    public List<persons> list();

}
