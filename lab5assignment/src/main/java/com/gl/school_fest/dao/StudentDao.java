package com.gl.school_fest.dao;

import java.util.List;

import com.gl.school_fest.model.Student;

public interface StudentDao {
	
	public void SaveorUpdate(Student student);
	public void delete(int id);
	public Student getStudent(int id);
	public List<Student> findAll();
}
