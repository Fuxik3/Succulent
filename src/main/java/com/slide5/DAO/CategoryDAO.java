package com.slide5.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slide5.beans.Category;

//@Repository
public interface CategoryDAO extends JpaRepository<Category,String> {}
