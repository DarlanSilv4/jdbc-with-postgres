package br.com.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.jdbc.ConnectionFactory;
import br.com.jdbc.model.Contact;

public class ContactDao {
	private Connection connection;
	
	public ContactDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void add(Contact contact) {
		String sql = "insert into contacts "+"(name,email,address,birthday) " + "values (?,?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, contact.getName());
			stmt.setString(2, contact.getEmail());
			stmt.setString(3, contact.getAddress());
			stmt.setDate(4, new Date(contact.getBirthday().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
