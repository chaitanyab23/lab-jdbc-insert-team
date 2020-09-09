package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public City getCityByName(String name) throws ClassNotFoundException, SQLException {
		
		Connection con= ConnectionManager.getConnection();
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM PROKABBADI");
		
		return null;
		
	}
}
