package com.slide5.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slide5.beans.Account;

//@Repository
public interface AccountDAO extends JpaRepository<Account,String> {}
