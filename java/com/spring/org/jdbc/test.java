package com.spring.org.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.org.jdbc.Dao.StudentDao;
import com.spring.org.jdbc.entities.Student;

public class test {

	public static void main(String[] args) {
		
		System.out.println("hello to my code");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/org/jdbc/jdbcconfig.xml");
		StudentDao studentDao=context.getBean("studentdao",StudentDao.class);
		//create and add
		/*Student student = new Student();
		student.setId(105);
		student.setName("john");
		student.setCity("krk");
		
		int result=studentDao.insert(student);
		System.out.println("result added "+result);*/
		
		//update
		/*Student student1 = new Student();
		
		student1.setId(105);
		student1.setName("hritik");
		student1.setCity("kolhapur");
		
		int result1=studentDao.change(student1);
		System.out.println("database modified"+result1);*/
		
		//delete
		
	/*	int r1=studentDao.deleteme(105);
		System.out.println("database modified with delete operation "+r1);
		*/
		
		//get records
		
		/*Student student4=studentDao.getstudent(102);
		System.out.println(student4);
		*/
		
		// get all records
		
		List<Student> student = studentDao.getallstuds();
		for(Student s: student)
		{
			System.out.println(s);
		}
		
		
		
		
		
	
		
		
		
		
				
	}

}
