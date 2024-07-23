package com.slide5.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slide5.beans.Student;

//@Repository
public interface StudentDAO extends JpaRepository<Student,String> {}
