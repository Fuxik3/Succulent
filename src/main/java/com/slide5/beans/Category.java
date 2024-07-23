package com.slide5.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Categories")
public class Category {

    @Id
    @Column(name = "Id")
    private String id;
    
    @Column(name = "Name")
    private String name;
    
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}

