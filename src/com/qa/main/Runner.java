package com.qa.main;

import java.sql.SQLException;

public class Runner {
	
	public static void main(String[] xyz) throws SQLException {
		DatabaseConnector db = new DatabaseConnector();
		
		db.readAllActors();
		db.createActor("Savannah", "vaith");
		db.readAllActors();
		
	}

}
