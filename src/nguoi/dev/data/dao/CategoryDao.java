package nguoi.dev.data.dao;

import java.util.List;

import nguoi.dev.data.model.Category;

public interface CategoryDao {
	public boolean insert(Category category);
	public boolean update(Category category);
	public boolean delete(int id);
	public Category find(int id);
	public List<Category> findAll();
}
