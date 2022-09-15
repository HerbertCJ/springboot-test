package com.herbert.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herbert.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
