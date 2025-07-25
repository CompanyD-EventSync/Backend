package com.eventsync.event.sync.service.interf;

import com.eventsync.event.sync.dto.CategoryDto;
import com.eventsync.event.sync.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}

