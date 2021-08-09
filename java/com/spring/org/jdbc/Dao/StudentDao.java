package com.spring.org.jdbc.Dao;

import com.spring.org.jdbc.entities.Student;
import java.util.List;

public interface StudentDao {

	public int insert(Student student);
	
	public int change(Student student);
	
	public int deleteme(int studid);
	
	public Student getstudent(int studentid);
	
	public List<Student> getallstuds();
	
	
	
}
