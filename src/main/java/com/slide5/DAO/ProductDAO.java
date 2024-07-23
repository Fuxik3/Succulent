package com.slide5.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slide5.beans.Product;

//@Repository
public interface ProductDAO extends JpaRepository<Product,Integer> {}
