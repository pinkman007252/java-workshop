package com.vetias.java.workshop.basics.tem.bin.Dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Organizationdao{

    public void createTable(Connection dbConnection) {
        try (Statement Statement = dbConnection.createStatement()) {
      Statement.execute ( """
                CREATE TABLE Organization (
                    id INT AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    ADDRESS VARCHAR(255)
                )
                """);

        } catch (SQLException sqlException) {
            System.out.println("Error creating table: " + sqlException);
        }
    }
}
