package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started...." );
        
        //spring jdbc=> JdbcTemplate 
//        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        //insert data
//        Student student=new Student();
//        student.setId(66);
//        student.setName("Salik Shaikh");
//        student.setCity("Mumbra");
//        
//        int result = studentDao.insert(student);
//        System.out.println("student added.."+result);
        
        //update data
//        Student student=new Student();
//        student.setId(245);
//        student.setName("Ahmed Raza");
//        student.setCity("Banglore");
//        
//        int result = studentDao.change(student);
//        System.out.println("data changed.."+result);
        
        //delete
//        int result = studentDao.delete(456);
//        System.out.println("deleted "+result);
        
        //fetching data from database
//        Student student = studentDao.getStudent(222);
//        System.out.println(student);
        
        //fetching multiple data
        List<Student> students=studentDao.getAllStudents();
        for (Student s: students) {
			System.out.println(s);
		}
        
        //it's not good practice
        //JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        //insert query
        //String query="insert into student(id,name,city) values(?,?,?)";
        //fire the query
        //int result = template.update(query,245,"Zulfikar alam","Sakinaka");
        //System.out.println("number of record inserted.."+result);
    }
}
