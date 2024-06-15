package com.example.layeredarchitecture.DAO;

import java.sql.SQLException;

public interface OrderDAO {
    public String generedNextOrderId() throws SQLException, ClassNotFoundException;
}
