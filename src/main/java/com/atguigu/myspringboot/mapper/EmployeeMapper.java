package com.atguigu.myspringboot.mapper;

import com.atguigu.myspringboot.bean.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee")
    public List<Employee> getMsg();

    @Delete("delete from employee where id = #{id}")
    public int deleteEmployee(Integer id);

    @Select("select * from employee where id = #{id}")
    public Employee getMsgById(Integer id);

    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{d_id} where id = #{id}")
    public int updateEmployee(Employee employee);

    @Insert("insert into employee(lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{d_id})")
    public int addEmployee(Employee employee);
}
