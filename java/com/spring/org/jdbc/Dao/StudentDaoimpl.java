package com.spring.org.jdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.org.jdbc.entities.Student;

public class StudentDaoimpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		String query ="insert into student(id,name,city) values (?,?,?)";
		int result =this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
		
		
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	
	@Override
	public int change(Student student1) {
		//updating query
		String query ="update student set name=? , city= ? where id=?";
		int result=this.jdbcTemplate.update(query,student1.getName(),student1.getCity(),student1.getId());
		
		return result;
	}
	@Override
	public int deleteme(int studid) {
		String query ="delete from student where id =?";
		int r=this.jdbcTemplate.update(query,studid);
		return r;
	}
	@Override
	public Student getstudent(int studentid) {
		//retriving single student
		String query =" select * from student where id =?";
		RowMapper<Student> rowMapper =new Rowmapperimpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper ,studentid);
		
		return student;
	}
	@Override
	public List<Student> getallstuds() {
		String query = "select * from student";
		List<Student>student=this.jdbcTemplate.query(query, new Rowmapperimpl());
		
		return student;
	}
	
	
	

	
	

}
