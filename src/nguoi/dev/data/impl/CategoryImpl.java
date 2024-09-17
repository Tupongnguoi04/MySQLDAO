package nguoi.dev.data.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import nguoi.dev.data.dao.CategoryDao;
import nguoi.dev.data.model.Category;

public class CategoryImpl implements CategoryDao {
	private Connection getConnection() {
		// TODO Auto-generated method stub
		 final String DB_URL="jdbc:mysql://localhost:3306/shop";
		 final String DB_USER  = "root";
		 final String DB_PASS  = "";
		//Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			//System.out.println("Ket noi thanh cong");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean insert(Category category) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO CATEGORIES(NAME, THUMBNAIL) VALUES (?,?)";
		try {
			Connection conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, category.name);
			stmt.setString(2, category.thmubnail);
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
				
		return true;
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Category find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
