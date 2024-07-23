package com.slide5.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slide5.beans.Orderdetail;

//@Repository
public interface OrderDetailDAO extends JpaRepository<Orderdetail,Integer> {}
