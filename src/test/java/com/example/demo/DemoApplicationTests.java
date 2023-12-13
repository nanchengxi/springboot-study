package com.example.demo;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.mapper.personsMapper;
import com.example.demo.sql.Emp;
import com.example.demo.sql.persons;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private personsMapper personsMapper;
	@Autowired
	private EmpMapper empMapper;
	@Test
	public void testDelete(){
		empMapper.Delete(17);
	}
	@Test
	public void testListpersons(){
		List<persons> personsList = personsMapper.list();
		personsList.stream().forEach(person -> {
			System.out.println(person);
		});
	}
	@Test
	public void testInsert(){
		Emp emp = new Emp();
		emp.setUsername("Tom2");
		emp.setName("汤姆2");
		emp.setImage("1.img");
		emp.setGender((short)1);
		emp.setJob((short)1);
		emp.setEntrydate(LocalDate.of(2000,1,1));
		emp.setCreateTime(LocalDateTime.now());
		emp.setUpdateTime(LocalDateTime.now());
		emp.setDeptId(1);
		empMapper.Insert(emp);
		System.out.println(emp.getId());
	}
	@Test
	public void testUpdate(){
		Emp emp = new Emp();
		emp.setId(18);
		emp.setUsername("Tom1");
		emp.setName("汤姆1");
		emp.setImage("1.img");
		emp.setGender((short)1);
		emp.setJob((short)1);
		emp.setEntrydate(LocalDate.of(2000,1,1));
//		emp.setCreateTime(LocalDateTime.now());
		emp.setUpdateTime(LocalDateTime.now());
		emp.setDeptId(1);
		empMapper.Update(emp);
	}
	@Test
	public void TestGetById(){
		Emp emp = empMapper.GetById(2);
		System.out.println(emp);
	}
	@Test
	void contextLoads() {
	}

}
