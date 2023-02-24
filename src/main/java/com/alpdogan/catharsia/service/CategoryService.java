package com.alpdogan.catharsia.service;

import com.alpdogan.catharsia.entity.Category;
import com.alpdogan.catharsia.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(int id) {
        return categoryRepository.findCategoryById(id);
    }

    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public void updateCategoryById(int id, Category category) {
        category.setId(id);
        categoryRepository.save(category);
    }

    public void deleteCategoryById(int id) {
        categoryRepository.delete(categoryRepository.findCategoryById(id));
    }

}