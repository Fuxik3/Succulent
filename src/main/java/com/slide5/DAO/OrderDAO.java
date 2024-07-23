package com.slide5.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slide5.beans.Order;

//@Repository
public interface OrderDAO extends JpaRepository<Order,Integer> {}
