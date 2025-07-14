package com.vetias.java.workshop.basics.tem.bin.Dao;



    public class JDBCDAOApplication {
     public static void main(String[] args) {
        OrganizationDao organizationDao = new OrganizationDao();
        organizationDao.createTable();
     }
}

