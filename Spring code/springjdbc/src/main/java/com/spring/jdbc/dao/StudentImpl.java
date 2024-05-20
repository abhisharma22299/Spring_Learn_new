package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entites.Student;

public class StudentImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// insert query
		String query = "insert into student(id,name,city) values (?,?,?)";
		int insert = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return insert;
	}
	@Override
	public int change(Student student) {
		String query = "update  student set name=?  ,city=? where id=?";
		int update = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return update;
		
	}
	@Override
	public int delete(int studentId) {
		
		String query = "delete from  student  where id=?";
		int delete = this.jdbcTemplate.update(query,studentId);
		return delete;		
	}
	
	@Override
	public Student getStudent(int studentId) {
// selecting single object data
		String query = "select * from  student  where id=? ";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		return this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		
	
	}
	@Override
	public List<Student> getAllStudent() {
		// selecting all student
		String query="select * from student";
		List<Student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return student;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
