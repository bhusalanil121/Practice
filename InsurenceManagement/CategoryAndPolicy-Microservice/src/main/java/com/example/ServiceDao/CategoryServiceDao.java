package com.example.ServiceDao;

import java.util.List;

import com.example.entity.Category;

public interface CategoryServiceDao {
	public List<Category> getAllCategory();
	public Category addCategory(Category category);
	public boolean deleteCategory(String catId);
	public Category updateCategory(Category category);
	public Category getCategoryById(String catId);
}
