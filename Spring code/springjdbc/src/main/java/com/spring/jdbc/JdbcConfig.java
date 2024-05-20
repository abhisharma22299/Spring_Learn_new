package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentImpl;

public class JdbcConfig {
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setPassword("Abhi@321");
		ds.setUsername("root");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;

	}

	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;		
	}
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		StudentImpl student =new StudentImpl();
		student.setJdbcTemplate(getTemplate());
		return student;
	}
}
