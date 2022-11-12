package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//save student
	@Transactional
	public int insert(Student student) 
	{
		//insert
		Integer i=(Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//get the single data
	public Student getStudent(int studentId) 
	{
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//get all students(all rows})
	public List<Student> getAllStudents()
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//deleting the data
	@Transactional
	public void deleteStudent(int studentId) 
	{
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//updating data...
	@Transactional
	public void updateStudent(int id1) 
	{
		this.hibernateTemplate.update(id1);
	}
	
	public HibernateTemplate getHibernateTemplate() 
	{
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) 
	{
		this.hibernateTemplate=hibernateTemplate;
	}
}
