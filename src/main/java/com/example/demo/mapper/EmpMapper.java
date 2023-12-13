package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;
import com.example.demo.sql.Emp;

@Mapper
public interface EmpMapper {
    @Delete("delete from emp where id = #{id}")
    public void Delete(Integer id);
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "   values(#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime}) ")
    public void Insert(Emp emp);
    @Update("update emp set username = #{username},name = #{name}, gender = #{gender}, image = #{job}, entrydate = #{entrydate},dept_id = #{deptId},update_time = #{updateTime} where id = #{id}")
    public void Update(Emp emp);
    @Select("select * from emp where id = #{id}")
    public Emp GetById(Integer id);
}
