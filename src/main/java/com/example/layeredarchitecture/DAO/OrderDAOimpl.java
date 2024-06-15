package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderDAOimpl implements OrderDAO{
@Override
    public String generedNextOrderId() throws SQLException, ClassNotFoundException {
       try {
           Connection connection = DBConnection.getDbConnection().getConnection();
           Statement stm = connection.createStatement();
           ResultSet rst = stm.executeQuery("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");

           return rst.next() ? String.format("OID-%03d", (Integer.parseInt(rst.getString("oid").replace("OID-", "")) + 1)) : "OID-001";
       } catch (SQLException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       } catch (NumberFormatException e) {
           throw new RuntimeException(e);
       }


    }
}
