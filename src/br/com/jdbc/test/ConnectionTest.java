package br.com.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.jdbc.ConnectionFactory;

public class ConnectionTest {
	public static void main (String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Connected!");
		connection.close();
	}
}
